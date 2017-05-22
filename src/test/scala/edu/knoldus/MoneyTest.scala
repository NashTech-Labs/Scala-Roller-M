package edu.knoldus

import org.scalacheck.Gen
import org.scalatest.FunSuite
import org.scalatest.prop.PropertyChecks

class MoneyTest extends FunSuite with PropertyChecks {
  test("Cannot create money with negative value") {
    intercept[IllegalArgumentException] {
      new Money(-2)
    }
  }

  test("Addition of two currencies") {
    val money = new Money(10)

    val ngen = for (n <- Gen.choose(0, 1000)) yield n
    val mgen = for (m <- Gen.choose(0, 1000)) yield m

    forAll(ngen, mgen) { (n: Int, m: Int) =>
      println(n, m)
      val res = money.addCurrencies(n, m)
      assert(res >= m)
    }
  }

}

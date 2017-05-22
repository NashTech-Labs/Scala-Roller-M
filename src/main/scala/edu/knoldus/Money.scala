package edu.knoldus

class Money (amount:Int){
  require(amount>0)

  def addCurrencies(a:Int, b:Int) = {
    require(a>0)
    require(b>0)
    a+b
  }
}


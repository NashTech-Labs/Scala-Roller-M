println("This is a sample worksheet")

sealed class Animal
class Bird extends Animal
final class Fish extends Animal

class Dog

def helloFile(a:Animal) = println("hello")

helloFile(new Bird)
helloFile(new Fish)

val highNoon = "12:00"

def whatTimeIsIt(any: Any): String = any match {
  case `highNoon` => "High noon"
  case _ => s"$any is no time!"
}

whatTimeIsIt("12:00")

for (keyAndValue <- Vector(1 -> "a", 2 -> "b"))
  yield keyAndValue._1 + keyAndValue._2

for ((key, value) <- Vector(1 -> "a", 2 -> "b"))
  yield key + value

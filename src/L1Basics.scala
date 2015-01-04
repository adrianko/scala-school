object L1Basics {
  def main(args: Array[String]) = {
    //Expressions
    println(1 + 1)

    //Values
    val two = 1 + 1
    println(two)

    var name = "steve"
    println(name)
    name = "ak"
    println(name)

    //functions
    def addOne(m: Int): Int = m + 1

    val three = addOne(2)
    println(three)

    def addOne2(x: Int) : Int = {
      x + 1
    }

    val anotherThree = addOne2(2)
    println(anotherThree)

    //anonymous function
    val addOne3 = (x: Int) => x + 1
    val threeAnon = addOne3(2)
    println(threeAnon)

    val addTwo = { x: Int =>
      x + 2
    }

    val plusTwo = addTwo(2)
    println(plusTwo)

    //partial application
    def adder(m: Int, n: Int) = m + n
    println(adder(5, 4))

    val add2 = adder(2, _:Int)
    println(add2(5))

    //curried functions
    def multiply(m: Int)(n: Int): Int = m * n
    println(multiply(5)(4))

    val timesTwo = multiply(2)_
    println(timesTwo(5))

    val curriedAdd = (adder _).curried
    val addFour = curriedAdd(4)
    println(addFour(5))

    //variable length argument
    def capitalizeAll(args: String*) = {
      args.map { arg =>
        arg.capitalize
      }
    }

    println(capitalizeAll("rarity", "applejack"))

    def capitalizeAll2(args: String*) = args.map ( _.capitalize)

    println(capitalizeAll2("rarity", "applejack"))

    //classes
    val calc = new Calculator("HP")
    println(calc.add(1, 2))
    println(calc.brand)
    println(calc.color)

  }
}

//classes
class Calculator(b: String) {

  //property
  val brand: String = b

  //constructor
  val color: String = if(brand == "TI") {
    "blue"
  } else if(brand == "HP") {
    "black"
  } else {
    "white"
  }

  //some method
  def add(m: Int, n: Int): Int = m + n
}

//inheritance
class ScientificCalculator(b: String) extends Calculator(b) {
  def log(m: Double, base: Double) = math.log(m) / math.log(base)
}

class EvenMoreScientificCalculator(b: String) extends ScientificCalculator(b) {
  def log(m: Int): Double = log(m, math.exp(1))
}

//abstract classes
abstract class Shape {
  def getArea(): Int
}

class Circle(r: Int) extends Shape {
  def getArea(): Int = { r * r * 3 }
}

//traits
trait Car {
  val brand: String
}

trait Shiny {
  val shineRefraction: Int
}

class BMW extends Car with Shiny {
  val brand = "BMW"
  val shineRefraction = 12
}

//types
trait Cache[K, V] {
  def get(key: K): V
  def put(key: K, value: V)
  def remove[K](key: K)
}
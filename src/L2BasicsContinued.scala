//package com.maestery.ak
object L2BasicsContinued {
  def main(args: Array[String]) = {
    println(FooMaker())
    println(new Bar)
    addOne(1)
    val plusOne = new AddOne()
    plusOne(1)

    //pattern matching
    val times = 1
    times match {
      case 1 => "one"
      case 2 => "two"
      case _ => "some other number"
    }

    //case classes
    case class Calculator(brand: String, model: String)

    val hp20b = Calculator("hp", "20B")
    val hp30b = Calculator("hp", "30B")

    def calcType(calc: Calculator) = calc match {
      case Calculator("hp", "20B") => "financial"
      case Calculator("hp", "48G") => "scientific"
      case Calculator("hp", "30B") => "business"
      case Calculator(_, _) => "Calculator is of unknown type"
    }

    //exceptions

  }

  def bigger(o: Any): Any = {
    o match {
      case i: Int if i < 0 => i - 1
      case i: Int => i + 1
      case d: Double if d < 0.0 => d - 0.1
      case d: Double => d + 0.1
      case text: String => text + "s"
    }
  }
}

//apply methods
class Foo {}
object FooMaker {
  def apply() = new Foo
}

class Bar {
  def apply() = 0
}

//functions are objects
object addOne extends Function1[Int, Int] {
  def apply(m: Int): Int = m + 1
}

class AddOne extends (Int => Int) {
  def apply(m: Int): Int = m + 1
}


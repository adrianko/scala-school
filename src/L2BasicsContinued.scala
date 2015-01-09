object L2BasicsContinued {
  def main(args: Array[String]) = {
    println(FooMaker())
    println(new Bar)
    addOne(1)
    val plusOne = new AddOne()
    plusOne(1)
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
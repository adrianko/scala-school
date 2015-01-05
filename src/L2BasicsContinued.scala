object L2BasicsContinued {
  def main(args: Array[String]) = {
    println(FooMaker())
    println(new Bar)
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
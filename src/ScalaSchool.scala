import java.util
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

trait Car {
  val brand: String
}

trait Fuel {
  val pod: String
}

trait Engine {
  val size: Float
}

class Ferrari(colour: String) extends Car with Fuel with Engine {
  val brand = if(colour == "red") "red" else "not red"
  val pod = "petrol"
  val size = 2.4F
}

object ScalaSchool {

  def curriedAdd(a: Int)(b: Int) = {
    normalAdd(a, b)
  }

  def normalAdd(a: Int, b: Int) = {
    a + b
  }

  def varNumArgsCapitalize(strings: String*) = {
    strings.map( (s) => s.capitalize )
  }

  def addList(numbers: List[Int]) = {
    numbers.foldLeft(0) { (c, e) =>
      c + e
    }
  }

  def main(args: Array[String]) = {
    val curr = curriedAdd(5)_
    println(curr(3))

    val partial = normalAdd(2, _:Int)
    println(partial(3))

    val lambda = (x:Int, y:Int) => x * y
    println(lambda(3, 6))

    val c = new Ferrari("blue")
    println(c.brand)
    println(c)

    println(varNumArgsCapitalize("abc", "def", "ghi", "jkl"))
    println(addList(List(2,4,6,8)))
    println(List(1,2,3,4,5,6).filter( _ % 2 == 0 ).map( _ * 5 ))
    println("Scala!".dropRight(2).take(3).capitalize)
    List(1,2,3).foreach((x) => println(x))

    var adrian_lb = new ListBuffer[String]()
    List("adrian", "adrian").foreach( (s: String) => adrian_lb += s.toUpperCase )

    println(adrian_lb.toList)
    println(List("adrian", "adrian").map( _.capitalize ))
    println("HW".getClass.getName)

    val name = "AK"
    val age = 21
    println(s"Hello $name, I am ${age + 1}")
    println(1.toString)

    val s2: mutable.Stack[String] = new mutable.Stack[String]()
    s2.push("a")
    s2.push("c")
    s2.push("b")
    println(s2)
    s2.pop()
    println(s2)

    val q1: util.Queue[String] = new util.LinkedList[String]()
    q1.add("a")
    q1.add("c")
    q1.add("b")
    println(q1)
    println(q1.peek())
    println(q1)
    println(q1.poll())
    println(q1)
  }

}

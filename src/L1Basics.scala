object L1Basics extends Base {
  def main(args: Array[String]) = {
    //Expressions
    println(1 + 1)

    //Values
    val two = 1 + 1
    println(two)
    varDump("two", two)

    var name = "steve"
    varDump("name", name)

    name = "ak"
    varDump("name", name)

    //functions
    def addOne(m: Int): Int = m + 1

    def addOne2(x: Int) : Int = {
      x + 1
    }

    val three = addOne(2)
    varDump("three", three)


    def capitalizeAll(args: String*) = {
      args.map { arg =>
        arg.capitalize
      }
    }

    println(capitalizeAll("rarity", "applejack"))

    def capitalizeAll2(args: String*) = args.map ( _.capitalize)

    println(capitalizeAll2("rarity", "applejack"))

  }
}

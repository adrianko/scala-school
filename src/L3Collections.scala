object L3Collections {
    def main(args: Array[String]) {
        //lists
        val numbers = List(1,2,3,4)

        //sets
        println(Set(1,2,3))

        //tuple
        val tuple = ("localhost", 80)
        println(tuple._1)

        //maps
        Map(1 -> 2)
        Map("foo" -> "bar")

        //option - a container thay may or may not hold something
        trait Option[T] {
            def isDefined: Boolean
            def get: T
            def getOrElse(t: T): T
        }


        //functional combinators
        //map
        numbers.map((i: Int) => i * 2)
        //or
        def timesTwo(i: Int): Int = i * 2
        numbers.map(timesTwo _)

        //foreach
        val doubled = numbers.foreach((i: Int) => i * 2)

        //filter
        numbers.filter((i: Int) => i % 2 == 0)

        //zip
        List(1,2,3).zip(List("a", "b", "c"))

    }
}

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

        //zip - aggregates the contents of two lists into a single list of pairs.
        List(1,2,3).zip(List("a", "b", "c"))

        //partition - splits a list based on where it falls with respect to a predicate function.
        val moreNumbers = List(1,2,3,4,5,6,7,8,9,10)
        moreNumbers.partition(_ % 2 == 0)

        //find
        moreNumbers.find((i: Int) => i > 5)

        //drop - drops first i elements
        moreNumbers.drop(5)

        //dropWhile - removes elements until function not met
        moreNumbers.dropWhile(_ % 2 == 0)

        //foldLeft
        moreNumbers.foldLeft(0)((m: Int, n: Int) => m + n)

        //foldRight
        moreNumbers.foldRight(0)((m: Int, n: Int) => m + n)

        //flatten
        List(List(1, 2), List(3, 4)).flatten

        //flatMap - combines mapping and flattening
        val nestedNumbers = List(List(1, 2), List(3, 4))
        nestedNumbers.flatMap(x => x.map(_ * 2))

        //shorthand for this
        nestedNumbers.map((x: List[Int]) => x.map(_ * 2)).flatten
    }
}

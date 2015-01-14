object L5TypeBasics {
    def main(args: Array[String]) {
        //parametric polymorphism
        val l = List(2, 1, "bar", "foo", Nil)
        println(l.head)

        def drop1[A](l: List[A]) = l.tail
        println(drop1(List(1,2,3)))
    }
}

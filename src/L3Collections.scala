object L3Collections {
    def main(args: Array[String]) {
        //lists
        println(List(1,2,3,4))

        //sets
        println(Set(1,2,3))

        //tuple
        val tuple = ("localhost", 80)
        println(tuple._1)

        //maps
        Map(1 -> 2)
        Map("foo" -> "bar")

        
    }
}

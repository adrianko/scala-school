object L6AdvancedTypes {
    def main(args: Array[String]) {
        //type classes
        implicit def strToInt(x: String) = x.toInt

        class Container[A <% Int] { def addIt(x: A) = 123 + x}
    }
}

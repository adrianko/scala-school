object L4PatternMatchingAndFunctionalComposition {
    def main(args: Array[String]) {
        //function composition
        def f(s: String) = "f(" + s + ")"
        def g(s: String) = "g(" + s + ")"

        //compose
        val fComposeG = (f _).compose(g _)
        println(fComposeG("yay"))

        //andThen
        val fThenG = (f _).andThen(g _)
        println(fThenG("yay"))

        //partial function
        val one: PartialFunction[Int, String] = { case 1 => "one" }
        one.isDefinedAt(1) //true
        one.isDefinedAt(2) //false

        val two: PartialFunction[Int, String] = { case 2 => "two" }
        val three: PartialFunction[Int, String] = { case 3 => "three" }
        val wildcard: PartialFunction[Int, String] = { case _ => "else" }
        val partial = one.orElse(two.orElse(three.orElse(wildcard)))
        println(partial(5))

    }
}

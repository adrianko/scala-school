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

    }
}

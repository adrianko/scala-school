object L5TypeBasics {
    def main(args: Array[String]) {
        //parametric polymorphism
        val l = List(2, 1, "bar", "foo", Nil)
        println(l.head)

        def drop1[A](l: List[A]) = l.tail
        println(drop1(List(1,2,3)))

        //rank-1 polymorphism
        def toList[A](a: A) = List(a)
        //type mismatch
        //def foo[A, B](f: A => List[A], b: B) = f(b)

        //variance
        class Covariant[+A]
        val cv: Covariant[AnyRef] = new Covariant[String]
        //type mismatch
        //val cv: Covariant[String] = new Covariant[AnyRef]

        class Animal { val sound = "rustle" }
        class Bird extends Animal { override val sound = "call" }
        class Chicken extends Bird { override val sound = "cluck" }
        val getTweet: (Bird => String) = ((a: Animal) => a.sound)
        val hatch: (() => Bird) = (() => new Chicken)

        //bounds
        //def cacophony[T](things: Seq[T]) = things.map(_.sound) //non-member
        def biophony[T <: Animal](things: Seq[T]) = things.map(_.sound)

        biophony(Seq(new Chicken, new Bird))

        val flock = List(new Bird, new Bird)
        new Chicken :: flock
    }
}

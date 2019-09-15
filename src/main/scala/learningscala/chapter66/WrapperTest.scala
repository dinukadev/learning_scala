package learningscala.chapter66

object WrapperTest extends App {

  val result: Wrapper[Int] = for {
    x <- new Wrapper(1)
    y <- new Wrapper(2)
    z <- new Wrapper(3)
  } yield x + y + z
  println(result)
  println(result.map(_ * 2))
}

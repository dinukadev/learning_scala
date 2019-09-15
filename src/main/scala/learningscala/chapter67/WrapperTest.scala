package learningscala.chapter67

object WrapperTest extends App {

  val result: WrapperWithCompanionObject[Int] = for {
    x <- WrapperWithCompanionObject(1)
    y <- WrapperWithCompanionObject(2)
    z <- WrapperWithCompanionObject(3)
  } yield x + y + z
  println(result)
  println(result.map(_ * 2))
}

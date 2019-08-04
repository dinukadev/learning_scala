package learningscala.chapter59

object SumWithForLoop extends App {

  def makeInt(i: String): Option[Int] = {
    try {
      Some(i.trim.toInt)
    } catch {
      case e: Exception => None
    }
  }

  val numOne = makeInt("1")
  val numTwo = makeInt("2")

  val sum = for {
    x <- numOne
    y <- numTwo
  } yield x + y

  println(sum)
}

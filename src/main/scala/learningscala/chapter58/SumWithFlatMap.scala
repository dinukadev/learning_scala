package learningscala.chapter58

object SumWithFlatMap extends App {

  def makeInt(i: String): Option[Int] = {
    try {
      Some(i.trim.toInt)
    } catch {
      case e: Exception => None
    }
  }

  val numOne = makeInt("1")
  val numTwo = makeInt("2")

  val sum = numOne map { a => numTwo map { b => a + b } }

  println(sum)

  val sumWithFlatMap = numOne flatMap { a => numTwo map { b => a + b } }

  println(sumWithFlatMap)
}

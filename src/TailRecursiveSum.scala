import scala.annotation.tailrec

object TailRecursiveSum {


  def sum(list: List[Int]): Int = {
    @tailrec
    def sumWithAccumulator(list: List[Int], accumulator: Int): Int = list match {
      case Nil => accumulator
      case x :: xs => sumWithAccumulator(xs, accumulator + x)
    }

    sumWithAccumulator(list, 0)
  }


  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))
  }
}

object RecursiveSum {

  def sum(list:List[Int]):Int = list match{
    case Nil => 0
    case x :: xs => x+sum(xs)
  }

  def main(args: Array[String]): Unit = {
    println(sum(List(2,2)))
  }
}

package learningscala

object ByNameFunction {

  def byName[A](codeBlock: => A) = {
    val startTime = System.nanoTime()
    val result = codeBlock
    val endTime = System.nanoTime()
    (result, (endTime - startTime) / 100000d)
  }

  def main(args: Array[String]): Unit = {
    val de = {
      20 * 2
    }
    val (result, time) = byName(de)
    println(result)
    println(time)
  }
}

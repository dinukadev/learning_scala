package learningscala

object HandleException extends App {

  val handleEx = makeInt("test").getOrElse(0)

  println(handleEx)

  makeInt("test") match {
    case Some(i) => println(s"i = $i")
    case None => println("Oops exception occurred")
  }

  val result = for {
    x <- makeInt("1")
    y <- makeInt("2")
    z <- makeInt("=ss")
  } yield x + y + z

  println(result)

  def makeInt(s: String): Option[Int] = {
    try {
      Some(s.trim.toInt)
    } catch {
      case e: Exception => None
    }
  }


}

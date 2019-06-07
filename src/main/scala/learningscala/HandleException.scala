package learningscala

import scala.util.{Failure, Success, Try}

object HandleException extends App {

  val handleEx = makeInt("test").getOrElse(0)

  println(handleEx)

  makeInt("test") match {
    case Some(i) => println(s"i = $i")
    case None => println("Oops exception occurred")
  }

  makeIntWithTry("test") match {
    case Success(i) => println(s"i= $i")
    case Failure(e) => println(s"failure is $e")
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

  def makeIntWithTry(s: String) : Try[Int] = {
    Try(s.trim.toInt)
  }




}

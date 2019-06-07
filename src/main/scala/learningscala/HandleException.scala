package learningscala

import org.scalactic._

import scala.util.{Failure, Success, Try}

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

  makeIntWithTry("test") match {
    case Success(i) => println(s"i= $i")
    case Failure(e) => println(s"failure is $e")
  }

  makeIntWithScalatic("test") match {
    case Good(i) => println(s"i=$i")
    case Bad(e) => println(s"failrure is $e")
  }

  def makeInt(s: String): Option[Int] = {
    try {
      Some(s.trim.toInt)
    } catch {
      case e: Exception => None
    }
  }

  def makeIntWithTry(s: String): Try[Int] = {
    Try(s.trim.toInt)
  }

  def makeIntWithScalatic(s: String): Int Or ErrorMessage = {

    try {
      Good(s.trim.toInt)
    } catch {
      case e: Exception => Bad(e.toString)
    }
  }


}

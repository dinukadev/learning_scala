package learningscala

object HandleException extends App{

  val handleEx = makeInt("test").getOrElse(0)

  println(handleEx)

  makeInt("test") match {
    case Some(i) => println(s"i = $i")
    case None => println("Oops exception occurred")
  }


  def makeInt(s:String): Option[Int] = {
    try{
      Some(s.trim.toInt)
    }catch {
      case e: Exception => None
    }
  }



}

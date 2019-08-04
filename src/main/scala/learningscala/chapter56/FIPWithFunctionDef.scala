package learningscala.chapter56

object FIPWithFunctionDef extends App {

  case class StringToInt(run: String => Int)

  def len(s:String) = s.length

  val stringToInt = StringToInt(len)

  println(stringToInt.run("test"))
}

package learningscala.chapter56

object FIPWithAnonymous extends App {

  case class StringToInt(run: String => Int)

  val stringToInt = StringToInt { a: String =>
    a.length
  }

  print(stringToInt.run("test"))
}

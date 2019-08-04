package learningscala.chapter56

object ParamGroupWithAnonymous extends App {

  def paramGroup(s: String)(f: String => Int) = f(s)

  val paramGroupFunc = paramGroup("test") { s: String =>
    s.length
  }

  println(paramGroupFunc)
}

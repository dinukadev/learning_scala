package learningscala.chapter56

object FIPWithTwoParams extends App {

  case class TwoParams[A, B](func: (A, A) => B)


  def twoParamToOn(a: String, b: String) = a.length + b.length

  val twoParamFunc = TwoParams(twoParamToOn)

  println(twoParamFunc.func("test", "test"))

}

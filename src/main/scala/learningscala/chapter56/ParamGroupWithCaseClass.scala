package learningscala.chapter56

object ParamGroupWithCaseClass extends App {

  case class ParamGroup(s: String)(_f: String=>Int){
    def fun = _f(s)
  }

  val paramGroup = ParamGroup("test"){ s:String =>
    s.length
  }

  println(paramGroup.fun)
}

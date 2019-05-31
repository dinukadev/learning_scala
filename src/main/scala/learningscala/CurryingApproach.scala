package learningscala

object CurryingApproach {

  def curryingExampleOne(a: Int)(b: Int)(c: Int) = {
    a + b + c
  }

  def curryingWithOneParamGroup(a:Int,b:Int)={
    a+b
  }

  def main(args: Array[String]) = {
    //You can also use curryingExampleOne(2)_
    val funcWithParamOne = curryingExampleOne(2)(_: Int)(1)
    println(funcWithParamOne(1))

    val initialFunc = (curryingWithOneParamGroup _).curried

    println((curryingWithOneParamGroup _).isInstanceOf[Function2[_,_,_]])
    println(initialFunc(1)(2))



  }
}

object CurryingApproach {

  def curryingExampleOne(a: Int)(b: Int)(c: Int) = {
    a + b + c
  }

  def main(args: Array[String]) = {
    //You can also use curryingExampleOne(2)_
    val funcWithParamOne = curryingExampleOne(2)(_: Int)(1)
    println(funcWithParamOne(1))
  }
}

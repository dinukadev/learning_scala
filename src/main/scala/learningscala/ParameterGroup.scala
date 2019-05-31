package learningscala

object ParameterGroup {

  def add(a:Int)(b:Int)(c:Int) = {
    a+b+c;
  }

  def whilst(condition: => Boolean) (codeBlock: =>Unit) = {
      while(condition){
        codeBlock
      }
  }

  def testImplicit(a:String)(implicit condition: Boolean): Unit ={
    println(a)
  }

  def defaultValues(a:Int = 1)(b:Int = a) = {
    a+b
  }

  def main(args:Array[String]) = {
    println(add(1)(2)(3))

    var i = 1;

    whilst(i<5) {
      println(i)
      i+=1
    }

    testImplicit("Without Implicit: "+1)(true)

    implicit val boolVal = true

    testImplicit("Without Implicit: "+2)

    println(defaultValues(1)())
  }


}

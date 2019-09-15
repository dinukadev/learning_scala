package learningscala.chapter68

object DebuggableTest extends App {

  def f(a: Int): Debuggable = {
    val result = a * 2
    val message = s"f: a ($a) * 2 = $result"
    Debuggable(result, message)
  }

  def g(a: Int): Debuggable = {
    val result = a * 3
    val message = s"g: a ($a) * 3 = $result"
    Debuggable(result, message)
  }

  def h(a: Int): Debuggable = {
    val result = a * 4
    val message = s"h: a ($a) * 4 = $result"
    Debuggable(result, message)
  }

  val result = for {
    x <- f(100)
    y <- g(x)
    z <- g(y)
  } yield x + y + z

  println(s"value : ${result.value} , message : ${result.message}")
}

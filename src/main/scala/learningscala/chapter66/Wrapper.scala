package learningscala.chapter66

class Wrapper[A](value: A) {

  def map[B](f: A => B): Wrapper[B] = {
    val result = f(value)
    new Wrapper(result)
  }

  def flatMap[B](f: A => Wrapper[B]): Wrapper[B] = f(value)

  override def toString: String = value.toString
}

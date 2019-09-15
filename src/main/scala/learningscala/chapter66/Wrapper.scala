package learningscala.chapter66

class Wrapper[Int](value: Int) {

  def map(f: Int => Int): Wrapper[Int] = {
    val result = f(value)
    new Wrapper(result)
  }

  def flatMap(f: Int => Wrapper[Int]): Wrapper[Int] = f(value)

  override def toString: String = value.toString
}

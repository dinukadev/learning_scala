package learningscala.chapter68

case class Debuggable(value: Int, message: String) {

  def map(f: Int => Int): Debuggable = {
    val newValue = f(this.value)
    Debuggable(newValue, message)
  }

  def flatMap(f: Int => Debuggable): Debuggable = {
    val newValue = f(this.value)
    Debuggable(newValue.value, message + "\n" + newValue.message)
  }
}

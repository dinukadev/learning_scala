package learningscala.chapter67

class WrapperWithCompanionObject[A] private(value: A) {

  def map[B](f: A => B): WrapperWithCompanionObject[B] = {
    new WrapperWithCompanionObject[B](f(value))
  }

  def flatMap[B](f: A => WrapperWithCompanionObject[B]): WrapperWithCompanionObject[B] = f(value)

  override def toString: String = value.toString
}

object WrapperWithCompanionObject {
  def apply[A](value: A): WrapperWithCompanionObject[A] = new WrapperWithCompanionObject(value)
}

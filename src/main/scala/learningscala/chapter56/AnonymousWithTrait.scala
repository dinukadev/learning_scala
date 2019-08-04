package learningscala.chapter56

object AnonymousWithTrait extends App {

  trait Person {
    def name: String

    def age: Int

    override def toString: String = s"name: $name, age: $age"
  }

  val mary = new Person {
    val name = "mary"
    val age = 22
  }

  print(mary)

}

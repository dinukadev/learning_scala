package learningscala

object ForLoop extends App {

  case class Person(name: String)

  val personList = List(Person("Dinuka"),Person("Roshan"))

  val namesStartingWithD = for {
    p <- personList
    firstName = p.name
    if(firstName.startsWith("D") && firstName.endsWith("a"))
  } yield firstName.toUpperCase


  println(namesStartingWithD)
}

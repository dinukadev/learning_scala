package learningscala.chapter57

object FlatMapWithMapAndFlatten extends App {

  val myList = List("foo","bar").map(_.split(""))
  println(myList.flatten)

  val myListWithFlatMap = List("foo","bar").flatMap(_.split(""))
  println(myListWithFlatMap)
}

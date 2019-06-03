package learningscala

import scala.collection.mutable.ArrayBuffer

object MySeqImpl extends App{

  case class Sequence[A](initialElements: A*){
    private val elemes = ArrayBuffer[A]();

    elemes ++= initialElements
  }

  val mySeq = new Sequence(1,2,3)

  println(mySeq)
}

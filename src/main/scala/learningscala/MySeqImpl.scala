package learningscala

import scala.collection.mutable.ArrayBuffer

object MySeqImpl extends App {

  case class Sequence[A](initialElements: A*) {
    private val elemes = ArrayBuffer[A]();

    elemes ++= initialElements

    def foreach(block: A => Unit): Unit = {
      elemes.foreach(block)
    }

    def map[B](f: A => B): Sequence[B] = {
      val abMap: ArrayBuffer[B] = elemes.map(f)

      Sequence(abMap: _*)
    }
  }

  val mySeq = new Sequence(1, 2, 3)

  println(mySeq)

  for (i <- mySeq) {
    println(i)
  }

  val multipleByTwo = for {
    i <-mySeq
  } yield  i*2

  println(multipleByTwo)
}

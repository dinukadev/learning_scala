package learningscala

import scala.collection.JavaConversions.`deprecated asJavaIterable`
import scala.collection.mutable.ArrayBuffer

object MySeqImpl extends App{

  case class Sequence[A](initialElements: A*){
    private val elemes = ArrayBuffer[A]();

    elemes ++= initialElements

    def foreach(block: A => Unit): Unit ={
      elemes.foreach(block)
    }
  }

  val mySeq = new Sequence(1,2,3)

  println(mySeq)

  for(i<-mySeq){
    println(i)
  }
}

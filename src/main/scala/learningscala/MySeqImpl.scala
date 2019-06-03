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

      //the :_ part of the code is a way to adapt a collection to work with a varargs parameter.
      Sequence(abMap: _*)
    }

    def withFilter(f: A => Boolean): Sequence[A] = {
      val filteredList = elemes.filter(f)
      Sequence(filteredList: _*)
    }

    def flatMap[B](f: A => Sequence[B]): Sequence[B] = {
      val mapped: Sequence[Sequence[B]] = map(f)
      flatten(mapped)
    }

    def flatten[B](seqOfSeq: Sequence[Sequence[B]]): Sequence[B]= {
      var xs = ArrayBuffer[B]()
      for(listB:Sequence[B] <- seqOfSeq){
        for(e<- listB){
          xs += e
        }
      }

      Sequence(xs: _*)
    }
  }

  val mySeq = new Sequence(1, 2, 3)

  println(mySeq)

  for (i <- mySeq) {
    println(i)
  }

  val multipleByTwo = for {
    i <- mySeq
  } yield i * 2

  println(multipleByTwo)

  val filterFour = for {
    i <- multipleByTwo
    if(i<3)
  } yield(i)

  println(filterFour)


  val myFirstList = Sequence(1,2,3)
  val mySecondList = Sequence(2,4,3)

  val itemsInBothLists = for {
    listOneItem<- myFirstList
    listTwoItem<- mySecondList
    if(listOneItem==listTwoItem)
  }yield listOneItem


  println(itemsInBothLists)
}

package learningscala.chapter86

import cats.Eval
import cats.data.State

object GolfingApp extends App {

  case class GolfState(distance: Int)

  def swing(distance: Int): State[GolfState, Int] = State { (s: GolfState) =>
    val newAmount = s.distance + distance
    (GolfState(newAmount), newAmount)
  }

  val stateWithNewDistance: State[GolfState, Int] = for {
    _ <- swing(20)
    _ <- swing(15)
    totalDistance <- swing(0)
  } yield totalDistance

  // initialize a `GolfState`
  val beginningState = GolfState(0)
  // run/execute the effect.
  // `run` is like `unsafeRunSync` in the Cats `IO` monad.
  val result: Eval[(GolfState, Int)] = stateWithNewDistance.run(beginningState)
  println(s"GolfState: ${result.value._1}") //GolfState(35)
  println(s"Total Distance: ${result.value._2}") //35


}

package learningscala.chapter80

import cats.effect.IO

object IOMonadHelloWorld extends App {

  val helloAffect = IO{println("Hello world")}

  helloAffect.unsafeRunSync()

}

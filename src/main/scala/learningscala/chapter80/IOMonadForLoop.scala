package learningscala.chapter80

import cats.effect.IO

import scala.io.StdIn

object IOMonadForLoop extends App {

  val program: IO[Unit] = for {
    _ <- IO {
      println("Type text")
    }
    name <- IO {
      StdIn.readLine
    }
    nameUC = name.toUpperCase
    _ <- IO {
      println(s"Hello $nameUC")
    }
  } yield ()

  program.unsafeRunSync()
}

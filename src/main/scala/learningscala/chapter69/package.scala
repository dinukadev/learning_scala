package learningscala

package object chapter69 {
  def getLine: IO[String] = IO(scala.io.StdIn.readLine())

  def putStrLn(s: String): IO[Unit] = IO(println(s))
}

name := "LearningScala"

version := "1.0"

scalaVersion := "2.12.2"

scalacOptions += "-Ypartial-unification"

libraryDependencies ++= Seq(
    "org.scalactic" %% "scalactic" % "3.0.5",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.typelevel" %% "cats-effect" % "2.0.0"
)

scalaVersion := "2.12.10"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.2"
// libraryDependencies += "io.delta" %% "delta-core" % "1.0.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.12" % "3.1.2" % "provided"
// libraryDependencies += "io.spray" %%  "spray-json" % "1.3.6"

// val AkkaVersion = "2.6.15"
// libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion

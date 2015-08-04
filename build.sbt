name := "fetch-site"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies += "org.scala-lang" % "scala-xml" % "2.11.0-M4"
libraryDependencies += "org.ccil.cowan.tagsoup" % "tagsoup" % "1.2.1"
libraryDependencies += "io.spray" %% "spray-client" % "1.3.3"
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

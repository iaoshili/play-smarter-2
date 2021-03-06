name := """play-smarter-2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += jdbc
libraryDependencies += cache
libraryDependencies += ws
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test


herokuAppName in Compile := "nameless-headland-72261"

libraryDependencies += "org.webjars" % "bootstrap" % "3.3.6"

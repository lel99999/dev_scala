name := "retirement_calculator"

version := "0.1"

scalaVersion := "2.12.8"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.4", "org.scalactic" %% "scalactic" % "3.0.4", "org.scalatest" %% "scalatest" % "3.0.4" % "test")
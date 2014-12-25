scalaJSSettings


name := "BatIncidentClock"

version := "1.0"

scalaVersion := "2.11.4"



libraryDependencies += "org.scala-lang.modules.scalajs" %%% "scalajs-jquery" % "0.6"

skip in ScalaJSKeys.packageJSDependencies := false

ScalaJSKeys.persistLauncher in Compile := true
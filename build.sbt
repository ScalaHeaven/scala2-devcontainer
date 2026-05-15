ThisBuild / scalaVersion := "2.13.18"

ThisBuild / semanticdbEnabled := true

lazy val root = (project in file("."))
  .settings(
    name := "scala2-devcontainer",
    version := "0.1.0-SNAPSHOT",
    assembly / mainClass := Some("Main"),
    assembly / assemblyJarName := "app.jar"
  )

val scala3Version = "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala33-compiler-crash",
    version := "0.1.0-SNAPSHOT",
    crossScalaVersions := Seq("2.13.10", "3.3.0"),
    scalaVersion := "3.3.0",
  )

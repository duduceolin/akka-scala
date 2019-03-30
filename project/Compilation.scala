import sbt.Keys.{libraryDependencies, _}
import sbt._

/**
  * Project compilation settings.
  */
object Compilation {

  lazy val apiName = "Assurance Proxy"
  lazy val suffix = ".jar"

  lazy val buildSettings = Seq(
    name := apiName,
    organization := "a",
    version := "1.0.0"
  )

  lazy val settings = Seq(
    // force java target and source versions
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),

    // set scala version
    ThisBuild / scalaVersion := "2.12.7",

    // add project dependencies
    libraryDependencies ++= Dependencies.all

  )
}
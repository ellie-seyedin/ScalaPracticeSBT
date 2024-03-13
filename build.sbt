ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPracticeSBT"
  )
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "3.5.0" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "3.5.0" % "provided"


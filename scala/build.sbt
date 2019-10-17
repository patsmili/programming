lazy val baseSettings = Seq(
  scalaVersion := "2.13.1",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  //scapegoatVersion in ThisBuild := "1.3.9"
)

lazy val codility = (project in file("codility"))
  .settings(baseSettings)
  .settings(name := "hackerrank")

lazy val hackerrank = (project in file("hackerrank"))
  .settings(baseSettings)
  .settings(name := "codility")

lazy val scalaHandsOn = (project in file("."))
  .aggregate(codility, hackerrank)
  .settings(name := "scalaHandsOn")
  .settings(baseSettings)
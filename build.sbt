import com.github.play2war.plugin._

name := "aws_ebs_test"

version := "1.0"

Play2WarPlugin.play2WarSettings

Play2WarKeys.servletVersion := "3.1"

Play2WarKeys.targetName := Some("ROOT")

lazy val `aws_ebs_test` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   , specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

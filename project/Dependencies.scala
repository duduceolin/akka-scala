import sbt.stringToOrganization

object Dependencies {

  lazy val json = Seq("com.typesafe.play" %%  "play-json" % "2.7.0")

  lazy val httpclient = Seq("com.softwaremill.sttp" %% "core" % "1.5.11")

  lazy val vault = Seq("com.bettercloud" % "vault-java-driver" % "4.0.0")

  lazy val gson = Seq("com.google.code.gson" % "gson" % "1.7.1")

  lazy val all = json ++ httpclient ++ vault ++ gson;
}

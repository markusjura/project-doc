resolvers ++= Seq(
  Resolver.bintrayRepo("akka-contrib-extra", "maven"),
  Resolver.url("GitHub repository", url("http://shaggyyeti.github.io/releases"))(Resolver.ivyStylePatterns)
)

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.0-RC1")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.0.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-stylus" % "1.0.1")

addSbtPlugin("default" % "sbt-sass" % "0.1.9")

// conductR
addSbtPlugin("com.typesafe.conductr" % "sbt-conductr" % "0.34.0")

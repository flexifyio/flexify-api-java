lazy val root = (project in file(".")).
  settings(
    organization := "io.flexify",
    name := "management-apiclient",
    version := "2.8.5",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.17",
      "org.glassfish.jersey.core" % "jersey-client" % "2.25.1",
      "org.glassfish.jersey.media" % "jersey-media-multipart" % "2.25.1",
      "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.25.1",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.8.9" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.8.9" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.9" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.8.9" % "compile",
      "com.brsanthu" % "migbase64" % "2.2",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )

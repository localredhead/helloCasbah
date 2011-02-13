import sbt._
class build(info: ProjectInfo) extends DefaultWebProject(info) {
 
// jetty
//val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.22" % "test"
//val servletApi = "org.mortbay.jetty" % "servlet-api" % "2.5-20081211" % "provided"
 
//casbah
val casbah = "com.mongodb.casbah" % "casbah_2.8.1" % "2.0.2"
}

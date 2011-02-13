package main.scala

/**
 * Created by IntelliJ IDEA.
 * User: dontask
 * Date: 2/12/11
 * Time: 10:51 AM
 * To change this template use File | Settings | File Templates.
 */

import com.mongodb.casbah.Imports._
import scala.xml._
import scala._

class mongoConn extends Application{

val mongoColl = MongoConnection()("temp")("first")

println(mongoColl.find())

}
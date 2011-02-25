package main.scala

import com.mongodb.casbah.Imports._
import scala._

object mongoConn extends Application
{
      var mongoColl = MongoConnection()("temp")("first")

      var scalaColl = mongoColl.find();

      scalaColl.foreach( x => println(x("hobby")));

}
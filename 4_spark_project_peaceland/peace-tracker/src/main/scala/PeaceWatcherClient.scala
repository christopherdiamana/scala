import java.net._
import java.io._
import scala.io._

import java.util.Calendar
import com.google.gson.Gson

import main.scala.message._

object PeaceWatcherClient {
  def main(args: Array[String]) {
    while (true) {
      readLine()

      val peaceWatcherServer = new Socket(InetAddress.getByName("localhost"),
        9999)
      print("PeaceWatcherClient: Report Sent")

      val out = new PrintStream(peaceWatcherServer.getOutputStream())
      val message = Message(args(0).toInt, 0.0, 0.0,
        Citizen("Alvin Alexander", args(0).toInt), Array("hello", "world"),
        Calendar.getInstance().getTime())

      val gson = new Gson
      val send = gson.toJson(message)

      out.println(send)
      out.flush()

      peaceWatcherServer.close()
    }
  }
}




import java.net._
import java.io._
import scala.io._

import scala.collection.mutable.ListBuffer

object PeaceMakerServer {
  def main(args: Array[String]) {
    println("PeaceMakerServer: Listening")
    val server = new ServerSocket(8888)

    val clients = ListBuffer[Socket]()
    val outputs = ListBuffer[PrintStream]()

    while (true) {
      val socket = server.accept()

      val in = new BufferedSource(socket.getInputStream()).getLines()
      val received = in.next

      if (received == "PeaceMaker") {
        println("PeaceMakerServer: PeaceMaker connected")
        clients += socket
        val output = new PrintStream(socket.getOutputStream())
        outputs += output
      } else {
        outputs.foreach{_.println(received)}
        println("PeaceMakerServer: Alert forwarded")

        socket.close()
      }
    }

    clients.foreach{_.close()}
  }
}

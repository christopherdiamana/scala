import java.net._
import java.io._
import scala.io._

object PeaceWatcherServer {
  def main(args: Array[String]) {
    println("PeaceWatcherServer: Listening")
    val server = new ServerSocket(9999)

    val streamProcessor = server.accept()

    while (true) {
      val peaceWatcher = server.accept()

      val in = new BufferedSource(peaceWatcher.getInputStream()).getLines()
      val out = new PrintStream(streamProcessor.getOutputStream())

      while (in.hasNext) {
        val received = in.next
        println("PeaceWatcherServer: Report Received")
        out.println(received)
      }

      out.flush()
      peaceWatcher.close()
    }

    streamProcessor.close()
  }
}

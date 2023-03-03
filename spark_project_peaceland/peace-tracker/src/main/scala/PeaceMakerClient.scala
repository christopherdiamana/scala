import java.net._
import java.io._
import scala.io._

object PeaceMakerClient {
  def main(args: Array[String]) {
    val peaceMakerServer = new Socket(InetAddress.getByName("localhost"),
      8888)

    while (true) {
      val in = new BufferedSource(peaceMakerServer.getInputStream()).getLines()
      val out = new PrintStream(peaceMakerServer.getOutputStream())

      out.println("PeaceMaker")

      while (in.hasNext) {
        println(in.next)
      }
    }

    peaceMakerServer.close()
  }
}

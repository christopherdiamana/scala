import org.apache.spark.sql.SparkSession

import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}

import java.net._
import java.io._
import scala.io._

import java.util.Calendar
import com.google.gson.Gson

import main.scala.message._

object StreamProcessor {
  def main(args: Array[String]) {
    val sparkConf = new SparkConf().setAppName("NetworkWordCount")
    val ssc = new StreamingContext(sparkConf, Seconds(1))
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()

    val lines = ssc.socketTextStream("localhost", 9999,
      StorageLevel.MEMORY_AND_DISK_SER)
    lines.print()

    lines.saveAsTextFiles("/home/otiose/tmp/scala/batch")

    lines.foreachRDD { rdd =>
      rdd.foreachPartition { lines =>
        while (lines.hasNext) {
          val line = lines.next

          val gson = new Gson
          val message = gson.fromJson(line, classOf[Message])

          if (message.citizen.peacescore == 1) {
            val peaceMakerServer =
              new Socket(InetAddress.getByName("localhost"), 8888)
            val out = new PrintStream(peaceMakerServer.getOutputStream())

            val alert = Alert(message.citizen.name, message.longitude,
              message.latitude)

            val gson = new Gson
            val send = gson.toJson(alert)

            out.println(send)
            
            peaceMakerServer.close()
          }
        }

      }
    }

    ssc.start()
    ssc.awaitTermination()
  }
}


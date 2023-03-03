// package main.scala.message.Message
package main.scala.message

import java.util.Calendar
import com.google.gson.Gson

case class Citizen(name: String, peacescore: Int)
case class Message(peaceWatcherId: Int, longitude: Double, latitude: Double,
  citizen: Citizen, words: Array[String], time: java.util.Date)

case class Alert(name: String, longitude: Double, latitude: Double)

// object GsonTest extends App {
//   val now = Calendar.getInstance().getTime()

//   val p = Message(0, 0.0, 0.0, Citizen("Alvin Alexander", 0),
//     Array("hello", "world"), now)
//     // create a JSON string from the Person, then print it
//   val gson = new Gson
//   val jsonString = gson.toJson(p)

//   println(jsonString)

//   val message = gson.fromJson(jsonString, classOf[Message])

//   println(message.citizen.peacescore)
// }

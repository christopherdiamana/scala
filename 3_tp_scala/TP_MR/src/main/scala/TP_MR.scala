import scala.collection.MapView
import scala.io.BufferedSource

object TP_MR {
  /**
   * 4) Sum of wages:
   * With the case class Employee defined below, find the sum of salaries from a list of employees (ideally with map)
   *
   * Example:
   * scala> salarySum(List(Employee("Jon", 2000), Employee("Jane", 3500)))
   * res0: Double = 5500.0
   */

  case class Employee(name: String, salary: Double)

  //DONE define salarySum which is the sum of the salaries from a list of employees
  //Hint it's a map reduce
  def salarySumA(employees: List[Employee]): Double = employees.map{ employee => employee.salary }.sum
  def salarySumB(employees: List[Employee]): Double = employees.map(_.salary).sum


  /**
   * 5) Address list:
   * With the case class User defined below, list the all their addresses
   *
   * Example:
   * scala> addressOf(List(User("Jon", "5 Av. des Champs-Élysées, Paris"), User("James","17 Boulevard Poissonnière, Paris")))
   * res0: List[String] = List("5 Av. des Champs-Élysées, Paris","17 Boulevard Poissonnière, Paris")
   */

  case class User(name: String, address: String)

  //DONE define addressOf which gives a list of addresses from a list of users
  def addressOfA(users: List[User]): List[String] = users.map{ user => user.address }
  def addressOfB(users: List[User]): List[String] = users.map(_.address)

  /**
   * 6) Define the average function (without .toList, or duplicates):
   *
   * Example:
   * scala> average(Iterator(1, 2, 3, 4, 5, 6, 7, 8))
   * res0: Option[Double] = Some(4.5)
   */

  //DONE define average which takes an Iterator of Double in parameter.
  //you can't use size, lengeth …
  //You can't use toList, toIterable, to whatever …

  //def average(values: Iterator[Double]): Option[Double] = values.foldLeft(0.0){ _ + _ }
  //def average(values: Iterator[Double]): Option[Double] = values.map(e => (e, 1)).reduce((e1, e2) => (e1._1 + e2._1, e1._2 + e2._2)).map(x => x._1/x._2)

  def averageA(values: Iterator[Double]): Option[Double] = values.map{x => (x, 1)}.reduceOption{(x,y) => (x._1 + y._1, x._2 + y._2)}.map(x => x._1/x._2)

  def averageB(values: Iterator[Double]): Option[Double] = {
    if (!values.isEmpty) {
      val ret = values.map(e => (e, 1)).reduce((e1, e2) => (e1._1 + e2._1, e1._2 + e2._2));
      Some(ret._1/ret._2);
    }
    else None
  }

  //def averageC(values: Iterator[Double]): Option[Double] = {
  //  values.foldLeft((Option.empty[Double], 1)) {
  //    case ((None, i), elt) => (Option(elt), i + 1)
  //    //case ((Some(avg), i), elt) => ((avg + (elt - avg)) / i, i + 1)
  //  }._1
  //}

  def averageD(values: Iterator[Double]): Option[Double] = {
    if (values.isEmpty)  None
    else {
      val res: (Int, Double) = values.foldLeft((0, 0.0)) {
        case ((count, sum), nextValue) => (count + 1, sum + nextValue)
      }
      Some(res._2 / res._1)
    }
  }

}

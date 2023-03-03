import TP_MR._

class TP_MapReduce_Test extends org.scalatest.FunSuite {
  /*test("giveMeHelloString function"){
    assert(giveMeHelloString == "Hello")
  }

  test("lastA function") {
    assert(TP_MR.lastA(List(1, 1, 2, 3, 5, 8)).get == 8)
    assert(TP_MR.lastA(Nil).isEmpty)
  }

  test("lastB function") {
    assert(TP_MR.lastB(List(1, 1, 2, 3, 5, 8)).get == 8)
    assert(TP_MR.lastB(Nil).isEmpty)
  }

  test("nthA function") {
    assert(TP_MR.nthA(2, List(1, 1, 2, 3, 5, 8)).get == 2)
    assert(TP_MR.nthA(6, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP_MR.nthA(-4, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP_MR.nthA(0, List()).isEmpty)
    assert(TP_MR.nthA(0, Nil).isEmpty)
  }

  test("nthB function") {
    assert(TP_MR.nthB(2, List(1, 1, 2, 3, 5, 8)).get == 2)
    assert(TP_MR.nthB(6, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP_MR.nthB(-4, List(1, 1, 2, 3, 5, 8)).isEmpty)
    assert(TP_MR.nthB(0, List()).isEmpty)
    assert(TP_MR.nthB(0, Nil).isEmpty)
  }

  test("reverseA function") {
    assert(TP_MR.reverseA(List(1, 2, 3, 4, 5)) == List(5, 4, 3, 2, 1))
    assert(TP_MR.reverseA(Nil) == Nil)
  }

  test("reverseB function") {
    assert(TP_MR.reverseB(List(1, 2, 3, 4, 5)) == List(5, 4, 3, 2, 1))
    assert(TP_MR.reverseB(Nil) == Nil)
  }*/

  test("salarySumA function") {
    assert(salarySumA(List(
      Employee("Jon",2000),
      Employee("Jane",3500),
      Employee("James",4123)
    )) == 9623.0)
    assert(salarySumA(Nil) == 0)
  }

  test("salarySumB function") {
    assert(salarySumB(List(
      Employee("Jon",2000),
      Employee("Jane",3500),
      Employee("James",4123)
    )) == 9623.0)
    assert(salarySumB(Nil) == 0)
  }

  test("addressOfA function") {
    assert(addressOfA(List(
      User("Jon", "5 Av. des Champs-Élysées, Paris"),
      User("James","17 Boulevard Poissonnière, Paris"),
      User("Jane", "52 Rue de Saintonge, Paris")
    )) == List(
      "5 Av. des Champs-Élysées, Paris",
      "17 Boulevard Poissonnière, Paris",
      "52 Rue de Saintonge, Paris"
    ))
    assert(addressOfA(Nil) == Nil)
  }

  test("addressOfB function") {
    assert(addressOfB(List(
      User("Jon", "5 Av. des Champs-Élysées, Paris"),
      User("James","17 Boulevard Poissonnière, Paris"),
      User("Jane", "52 Rue de Saintonge, Paris")
    )) == List(
      "5 Av. des Champs-Élysées, Paris",
      "17 Boulevard Poissonnière, Paris",
      "52 Rue de Saintonge, Paris"
    ))
    assert(addressOfB(Nil) == Nil)
  }

  test("averageA function") {
    assert(averageA(Iterator(1, 2, 3, 4, 5, 6, 7, 8)).get == 4.5)
    assert(averageA(Iterator.empty).isEmpty)
  }

  test("averageB function") {
    assert(averageB(Iterator(1, 2, 3, 4, 5, 6, 7, 8)).get == 4.5)
    assert(averageB(Iterator.empty).isEmpty)
  }

  //test("averageC function") {
  //  assert(averageC(Iterator(1, 2, 3, 4, 5, 6, 7, 8)).get == 4.5)
  //  assert(averageC(Iterator.empty).isEmpty)
  //}

  test("averageD function") {
    assert(averageD(Iterator(1, 2, 3, 4, 5, 6, 7, 8)).get == 4.5)
    assert(averageD(Iterator.empty).isEmpty)
  }

  //test("monoid") {
  //  assert((skiRatingAverage*100).round/100.0 == 4.41)
  //}

}

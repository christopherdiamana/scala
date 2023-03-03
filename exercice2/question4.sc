// Way 1
def duplicate[A](l: List[A]): List[A] = l.flatMap(e => List(e,e))

duplicate(List(1, 2, 3, 4, 5))


// Way 2 : Test
def duplicate(l: List[Int], acc: List[Int]= List()):List[Int] = {
  l match {
    case Nil => acc
    case x :: tail => duplicate(tail, x:: x :: acc)
  }
}.reverse

duplicate(List(1, 2, 3, 4, 5))
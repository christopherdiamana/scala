// Way 1
def penultimate(l: List[Int]): Option[Int] = l match {
  case Nil => None
  case x :: y :: Nil => Some(x)
  case x :: tail => penultimate(tail)
}

penultimate(List(1, 1, 2, 3, 5, 8))

//Way 2

def penultimate(l: List[Int]): Option[Int] = l.lift(l.size - 2)

penultimate(List(1, 1, 2, 3, 5, 8))

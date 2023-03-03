def encode[T](l: List[T], k: Int = 1): List[(Int, T)] = l match {
  case Nil => Nil
  case x :: y :: tail if (x == y) => encode(x :: tail, k + 1)
  case x :: tail => (k, x) :: encode(tail)
}

encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
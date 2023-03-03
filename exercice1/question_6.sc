def encodeModified[T](l: List[T], k: Int = 1): List[Any] = l match {
  case Nil => Nil
  case x :: y :: tail if (x == y) => encodeModified(x :: tail, k + 1)
  case x :: tail if (k < 2) => x :: encodeModified(tail)
  case x :: tail if (k > 1) =>  (k, x) :: encodeModified(tail)
}

encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))


List(("Jon", 2000),("Jane", 3500)).map{x => x._2 }.sum

Iterator(1, 2, 3, 4, 5, 6, 7, 8)
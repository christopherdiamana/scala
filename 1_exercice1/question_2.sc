def nth[T](k: Int, l: List[T]): T = l match {
  case x :: Nil if (k != 0) => throw new Exception("Out Of Bounds")
  case x :: _ if (k == 0) => x
  case x :: tail => nth(k - 1, tail)
  case Nil => throw new Exception("Empty list")
}

nth(4, List(1, 1, 2, 3, 5, 8))
nth(2, List(1, 1, 2, 3, 5, 8))



def nth[T](k: Int, l: List[T]): T = l(k)

nth(9, List(6, 4, 4, 9, 7, 0))
nth(4, List(6, 4, 4, 9, 7, 0))


// CORRECTION
def nth[T](x: Int, l: List[T]): Option[T] = (x, l) match {
  case (0, Nil) => None
  case (0, x :: tail) => Some(x)
  case (x, head :: tail) if x > 0 => nth(x-1, tail)
  case (x, list) => None
}

def nth[T](x: Int, l: List[T]): Either[String, T] = (x, l) match {
  case (0, Nil) => Left("list to short")
  case (0, x :: tail) => Right(x)
  case (x, head :: tail) if x > 0 => nth(x-1, tail)
  case (x, list) => Left("n should be positive")
}

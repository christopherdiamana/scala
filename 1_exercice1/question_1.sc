def last[T](l: List[T]): Option[T] = l match {
  case Nil => None
  case x :: Nil => Some(x)
  case x :: tail => last(tail)
}

last(List(1, 1, 2, 3, 5, 8))


def last[T](l: List[T]): T = l.last

last(Nil)


// CORRECTION

def last[T](list: List[T]): Option[T] = list match {
  case Nil => None
  case x :: Nil => Some(x)
  case x :: tail => last(tail)
}
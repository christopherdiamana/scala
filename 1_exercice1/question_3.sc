def reverse[T](l: List[T]): List[T] = l match {
  case Nil => Nil
  case x :: tail => reverse(tail) ::: List(x)
}

reverse(List(1))
reverse(List(1, 2))
reverse(List(1, 2, 3))
reverse(List(1, 1, 2, 3, 5, 8))


def reverse[T](l: List[T]): List[T] = l.reverse

reverse(List(1, 1, 2, 3, 5, 8, 7))


//CORRECTION
def reverse[T](list: List[T], acc: List[T] = Nil): List[T] = list match {
  case Nil => acc
  case x :: tail => reverse(tail, x :: acc)
}

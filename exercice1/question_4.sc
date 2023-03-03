def compress[T](l: List[T]): List[T] = l match {
  case Nil => Nil
  case x :: y :: tail if (x == y) => compress(x :: tail)
  case x :: tail => x :: compress(tail)
}

compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))

//def compress[T](l: List[T]): List[T] = l.reduce{ (x, y) => x }


// CORRECTION
def compress[T](l: List[T]): List[T] = l.foldLeft(List.empty[T]){
  case (Nil, el) => List(el)
  case (l, el) if (l.head == el) => l
  case (l,el) => el::l
}.reverse

compress(List(1,2,2,3))
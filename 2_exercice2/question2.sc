def length[T](l: List[T]) = l.foldLeft(0)((acc, el) => acc + 1)

length(List(1, 1, 2, 3, 5, 8))
Iterator(1, 2, 3, 4, 5, 6, 7, 8).map(e => (e, 1)).reduce((e1, e2) => (e1._1 + e2._1, e1._2 + e2._2))

Iterator(1, 2, 3, 7).map(e => (e, 1)).reduce((e1, e2) => (e1._1 + (e2._1 - e1._1) / e1._2, e1._2 + e2._2))._1

Iterator(1, 2, 3, 4).foldLeft((Option.empty[Double], 1)) {
    case ((None, i), elt) => (Option(elt), i + 1)
    case ((avg, i), elt) => (Option(avg.get + (elt - avg.get) / i), i + 1)
  }._1

Iterator(1, 2, 3, 4).foldLeft((Option.empty[Double], 1)) {
  case ((None, i), elt) => (Some(elt), i + 1)
  case ((Some(avg), i), elt) => (Some(avg + (elt - avg) / i), i + 1)
}._1
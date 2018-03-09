package lists.P09

object PackConsecutiveDuplicatesFromList {

  //Considerably slower
  def packConsecutiveDuplicatesFromListWithRecursive[A](list: List[A]): List[List[A]] =
    list match {
      case Nil => Nil
      case (head: A) :: (tail: List[A]) => List(head :: tail.takeWhile(_ == head)) ::: packConsecutiveDuplicatesFromListWithRecursive(tail.dropWhile(_ == head))
    }

  def packConsecutiveDuplicatesFromListWithSpan[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span {
        _ == list.head
      }
      if (next == Nil) List(packed)
      else packed :: packConsecutiveDuplicatesFromListWithSpan(next)
    }
  }

}

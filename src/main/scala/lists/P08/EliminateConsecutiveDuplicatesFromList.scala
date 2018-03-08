package lists.P08

import scala.annotation.tailrec


object EliminateConsecutiveDuplicatesFromList {

  def eliminateConsecutiveDuplicatesFromListWithBuiltIn[A](list: List[A]): List[A] =
    list.foldRight(List[A]()) { (head, result) =>
      if (result.isEmpty || head != result.head) head :: result else result
    }

  def eliminateConsecutiveDuplicatesFromListWithRecursive[A](list: List[A]): List[A] =
    list match {
      case Nil => Nil
      case head :: tail => head :: eliminateConsecutiveDuplicatesFromListWithRecursive(tail.dropWhile(_ == head))
    }

  def eliminateConsecutiveDuplicatesFromListWithTailRecursive[A](list: List[A]): List[A] = {
    @tailrec
    def eliminate[B](resultList: List[B], list: List[B]): List[B] =
      list match {
        case head :: tail => eliminate(head :: resultList, tail.dropWhile(_ == head))
        case Nil => resultList.reverse
      }

    eliminate(Nil, list)
  }
}

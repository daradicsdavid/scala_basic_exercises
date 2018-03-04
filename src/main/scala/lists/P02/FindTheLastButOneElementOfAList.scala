package lists.P02

import scala.annotation.tailrec

object FindTheLastButOneElementOfAList {
  def findTheLastButOneElementOfAListWithBuiltIn[A](list: List[A]): A = {
    list(list.size - 2)
  }

  def findTheLastElementOfAListWithPatternMatchingAndRecursion[A](list: List[A]): A = {
    @tailrec
    def findLast(list: List[A]): Option[A] = list match {
      case head :: Nil => Some(head)
      case head :: tail => if (tail.lengthCompare(1) == 0) Some(head) else findLast(tail)
      case _ => Option.empty
    }

    findLast(list).get
  }
}

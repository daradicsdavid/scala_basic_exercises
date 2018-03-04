package lists.P01

import scala.annotation.tailrec

object FindTheLastElementOfAList {
  def findTheLastElementOfAListWithBuiltIn[A](list: List[A]): A = {
    list.last
  }

  def findTheLastElementOfAListWithPatternMatchingAndRecursion[A](list: List[A]): A = {
    @tailrec
    def findLast(list: List[A]): Option[A] = list match {
      case head :: Nil => Some(head)
      case _ :: tail => findLast(tail)
      case _ => Option.empty
    }

    findLast(list).get
  }

}



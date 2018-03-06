package lists.P01

import scala.annotation.tailrec

object FindTheLastElementOfAList {
  def findTheLastElementOfAListWithBuiltIn[A](list: List[A]): A = list.last

  @tailrec
  def findTheLastElementOfAListWithPatternMatchingAndRecursion[A](list: List[A]): A = list match {
    case head :: Nil => head
    case _ :: tail => findTheLastElementOfAListWithPatternMatchingAndRecursion(tail)
    case _ => throw new NoSuchElementException
  }
}



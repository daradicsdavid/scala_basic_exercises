package lists.P02

import scala.annotation.tailrec

object FindTheLastButOneElementOfAList {
  def findTheLastButOneElementOfAListWithBuiltIn[A](list: List[A]): A =
    if (list.nonEmpty) list.init.last else throw new NoSuchElementException

  @tailrec
  def findTheLastElementOfAListWithPatternMatchingAndRecursion[A](list: List[A]): A = list match {
    case head :: _ :: Nil => head
    case _ :: tail => findTheLastElementOfAListWithPatternMatchingAndRecursion(tail)
    case _ => throw new NoSuchElementException
  }
}

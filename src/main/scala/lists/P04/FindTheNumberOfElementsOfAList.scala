package lists.P04

import scala.annotation.tailrec

object FindTheNumberOfElementsOfAList {

  def findTheNumberOfElementsOfAListWithBuiltIn[A](list: List[A]): Int = list.length

  def findTheNumberOfElementsOfAListWithRecursive[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + findTheNumberOfElementsOfAListWithRecursive(tail)
  }

  def findTheNumberOfElementsOfAListWithTailRecursive[A](list: List[A]): Int = {
    @tailrec
    def count(result: Int, list: List[A]): Int = list match {
      case Nil => result
      case _ :: tail => count(result + 1, tail)
    }

    count(0, list)
  }

  def findTheNumberOfElementsOfAListWithFoldLeft[A](list: List[A]): Int = list.foldLeft(0) { (c, _) => c + 1 }

}

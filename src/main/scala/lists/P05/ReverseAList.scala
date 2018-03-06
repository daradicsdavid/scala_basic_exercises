package lists.P05

import scala.annotation.tailrec


object ReverseAList {

  def reverseListWithBuiltIn[A](list: List[A]): List[A] = list.reverse

  def reverseListWithFoldRight[A](list: List[A]): List[A] = list.foldRight(List[A]()) { (element, list) => list :+ element }

  def reverseListWithFoldLeft[A](list: List[A]): List[A] = list.foldLeft(List[A]()) { (list, element) => element :: list }


  def reverseListWithRecursive[A](list: List[A]): List[A] = list match {
    case head :: tail => reverseListWithRecursive(tail) :+ head
    case Nil => Nil
  }

  def reverseListWithTailRecursive[A](list: List[A]): List[A] = {
    @tailrec
    def reverse[T](resultList: List[T], currentList: List[T]): List[T] = currentList match {
      case Nil => resultList
      case head :: tail => reverse(head :: resultList, tail)
    }

    reverse(Nil, list)
  }
}

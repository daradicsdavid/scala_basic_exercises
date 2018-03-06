package lists.P03

import scala.annotation.tailrec

object FindTheKthElementOfAList {

  def findTheKthElementOfAListWithBuiltIn[A](k: Int, list: List[A]): A = {
    if (0 <= k && k < list.size) list(k) else throw new NoSuchElementException
  }

  @tailrec
  def findTheKthElementOfAListWithRecursive[A](k: Int, list: List[A]): A = (k, list) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => findTheKthElementOfAListWithRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}

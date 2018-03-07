package lists.P07

object FlattenList {


  def flattenWithBuiltIn(list: List[Any]): List[Any] =
    list flatMap {
      case l: List[_] => flattenWithBuiltIn(l)
      case e => List(e)
    }

  def flattenWithTailRecursive(list: List[Any]): List[Any] = {
    def matchCases(element: Any): List[Any] = element match {
      case l: List[_] => flattenWithTailRecursive(l)
      case e => List(e)
    }

    @annotation.tailrec
    def helper(r: List[Any], ls: List[Any]): List[Any] = {
      ls match {
        case Nil => r
        case head :: tail => helper(r ::: matchCases(head), tail)
      }
    }

    helper(Nil, list)
  }


}

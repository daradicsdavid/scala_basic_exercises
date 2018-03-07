package lists.P07

object FlattenList {


  def flattenWithBuiltIn(list: List[Any]): List[Any] =
    list flatMap {
      case l: List[_] => flattenWithBuiltIn(l)
      case e => List(e)
    }
}

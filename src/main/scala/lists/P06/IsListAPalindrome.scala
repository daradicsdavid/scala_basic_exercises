package lists.P06


object IsListAPalindrome {

  def isPalindromeWithBuiltInWithoutView[A](vector: Vector[A]): Boolean = {
    vector == vector.reverse
  }

  def isPalindromeWithBuiltInWithView[A](vector: Vector[A]): Boolean = {
    vector.view == vector.view.reverse
  }

  def isPalindromeWithBuiltinExists[A](vector: Vector[A]): Boolean = {

    !vector.indices.exists(i => vector(i) != vector(vector.length - 1 - i))

  }

  def isPalindromeWithIteration[A](vector: Vector[A]): Boolean = {
    var result = true
    for (i <- vector.indices) {
      if (vector(i) != vector(vector.length - 1 - i)) result = false
    }
    result
  }
}

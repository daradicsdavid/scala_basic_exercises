package lists.P03

import java.util.NoSuchElementException

import lists.P03.FindTheKthElementOfAList.{findTheKthElementOfAListWithBuiltIn, findTheKthElementOfAListWithRecursive}
import org.scalatest.FunSuite

class FindTheKthElementOfAListTest extends FunSuite {

  test("testFindTheKthElementOfAListWithBuiltIn") {
    val result = findTheKthElementOfAListWithBuiltIn(1, List(1, 2))

    assert(result == 2)
  }

  test("testFindTheKthElementOfAListWithBuiltIn with wrong parameters") {
    intercept[NoSuchElementException] {
      findTheKthElementOfAListWithBuiltIn(3, List(1, 2))
    }

    intercept[NoSuchElementException] {
      findTheKthElementOfAListWithBuiltIn(-1, List(1, 2))
    }
  }

  test("testFindTheKthElementOfAListWithRecursive") {
    val result = findTheKthElementOfAListWithRecursive(1, List(1, 2))

    assert(result == 2)
  }

  test("testFindTheKthElementOfAListWithRecursive with wrong parameters") {
    intercept[NoSuchElementException] {
      findTheKthElementOfAListWithRecursive(3, List(1, 2))
    }

    intercept[NoSuchElementException] {
      findTheKthElementOfAListWithRecursive(-1, List(1, 2))
    }
  }


}

package lists.P05

import org.scalatest.FunSuite
import utils.ExecutionTimeUtils

class ReverseAListTest extends FunSuite {


  test("testReverseListWithBuiltIn") {
    testReverseList(ReverseAList.reverseListWithBuiltIn)
  }

  test("testReverseListWithFoldLeft") {
    testReverseList(ReverseAList.reverseListWithFoldLeft)
  }

  test("testReverseListWithFoldRight") {
    testReverseList(ReverseAList.reverseListWithFoldRight)
  }

  test("testReverseListWithRecursive") {
    testReverseList(ReverseAList.reverseListWithRecursive)
  }

  test("testReverseListWithTailRecursive") {
    testReverseList(ReverseAList.reverseListWithTailRecursive)
  }

  def testReverseList(functionToTest: List[Any] => List[Any]): Unit = {
    val list = List.range(1, 10)


    val result = ExecutionTimeUtils.time(functionToTest(list))

    for (i <- list.indices) {
      assert(list(i) == result(result.length - 1 - i))
    }
  }

}

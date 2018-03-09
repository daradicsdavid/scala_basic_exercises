package lists.P09

import org.scalatest.FunSuite
import utils.ExecutionTimeUtils

class PackConsecutiveDuplicatesFromListTest extends FunSuite {

  test("testPackConsecutiveDuplicatesFromListWithSpan") {
    testEmptyList(PackConsecutiveDuplicatesFromList.packConsecutiveDuplicatesFromListWithSpan)
    testNonEmptyList(PackConsecutiveDuplicatesFromList.packConsecutiveDuplicatesFromListWithSpan)
  }

  test("testPackConsecutiveDuplicatesFromListWithRecursive") {
    testEmptyList(PackConsecutiveDuplicatesFromList.packConsecutiveDuplicatesFromListWithRecursive)
    testNonEmptyList(PackConsecutiveDuplicatesFromList.packConsecutiveDuplicatesFromListWithRecursive)
  }


  def testEmptyList(functionToTest: List[Any] => List[List[Any]]): Unit = {
    val result = functionToTest(Nil)

    assert(result.isInstanceOf[List[List[Any]]])
  }

  def testNonEmptyList(functionToTest: List[Any] => List[List[Any]]): Unit = {
    val testList = List(1, 2, 2, 3, 3, 3, 1, 1, 1, 2, 2, 3)
    val expectedResultList = List(List(1), List(2, 2), List(3, 3, 3), List(1, 1, 1), List(2, 2), List(3))

    val result = ExecutionTimeUtils time functionToTest(testList)

    assert(result == expectedResultList)
  }

}

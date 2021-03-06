package lists.P07

import org.scalatest.FunSuite
import utils.ExecutionTimeUtils

import scala.collection.immutable.Nil

class FlattenListTest extends FunSuite {


  test("testFlattenWithBuiltIn") {
    testWithEmptyList(FlattenList.flattenWithBuiltIn)
    testWithNonEmptyList(FlattenList.flattenWithBuiltIn)
  }

  test("testFlattenWithTailRecursive") {
    testWithEmptyList(FlattenList.flattenWithTailRecursive)
    testWithNonEmptyList(FlattenList.flattenWithTailRecursive)
  }

  def testWithEmptyList(functionToTest: List[Any] => List[Any]): Unit = {
    val result = functionToTest(Nil)

    assert(result.isEmpty)
  }

  def testWithNonEmptyList(functionToTest: List[Any] => List[Any]): Any = {
    val testList = List(1, List(3, 4,List(5, 6, List(7, 8, 9))))
    val expectedList = List(1, 3, 4, 5, 6, 7, 8, 9)

    val result = ExecutionTimeUtils time functionToTest(testList)

    assert(result == expectedList)
  }
}

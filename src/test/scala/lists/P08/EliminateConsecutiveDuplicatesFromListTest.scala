package lists.P08

import org.scalatest.FunSuite
import utils.ExecutionTimeUtils

import scala.util.Random

class EliminateConsecutiveDuplicatesFromListTest extends FunSuite {


  test("testEliminateConsecutiveDuplicatesFromListWithBuiltIn") {
    testWithEmptyList(EliminateConsecutiveDuplicatesFromList.eliminateConsecutiveDuplicatesFromListWithBuiltIn)
    testWithNonEmptyList(EliminateConsecutiveDuplicatesFromList.eliminateConsecutiveDuplicatesFromListWithBuiltIn)
  }

  test("testEliminateConsecutiveDuplicatesFromListWithRecursive") {
    testWithEmptyList(EliminateConsecutiveDuplicatesFromList.eliminateConsecutiveDuplicatesFromListWithRecursive)
    testWithNonEmptyList(EliminateConsecutiveDuplicatesFromList.eliminateConsecutiveDuplicatesFromListWithRecursive)
  }

  test("testEliminateConsecutiveDuplicatesFromListWithTailRecursive") {
    testWithEmptyList(EliminateConsecutiveDuplicatesFromList.eliminateConsecutiveDuplicatesFromListWithTailRecursive)
    testWithNonEmptyList(EliminateConsecutiveDuplicatesFromList.eliminateConsecutiveDuplicatesFromListWithTailRecursive)
  }


  def testWithEmptyList(functionToTest: List[Any] => List[Any]): Unit = {
    val result = functionToTest(Nil)

    assert(result == Nil)
  }

  def testWithNonEmptyList(functionToTest: List[Any] => List[Any]): Any = {
    val (testList, expectedResultList) = createTestAndExpectedResultList()

    val result = ExecutionTimeUtils time functionToTest(testList)

    assert(result == expectedResultList)


  }

  def createTestAndExpectedResultList(): (List[Int], List[Int]) = {
    val random = Random
    val expectedResultList = for (i <- List.range(0, random.nextInt(100))) yield i

    val testList = expectedResultList.flatMap(i => List.fill(random.nextInt(10) + 1)(i))

    (testList, expectedResultList)
  }
}

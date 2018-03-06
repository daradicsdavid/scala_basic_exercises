package lists.P04

import org.scalatest.FunSuite

class FindTheNumberOfElementsOfAListTest extends FunSuite {

  test("testFindTheNumberOfElementsOfAListWithTailRecursive") {
    testWithEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithTailRecursive)
    testWithNonEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithTailRecursive)
  }

  test("testFindTheNumberOfElementsOfAListWithRecursive") {
    testWithEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithRecursive)
    testWithNonEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithRecursive)
  }

  test("testFindTheNumberOfElementsOfAListWithBuiltIn") {
    testWithEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithBuiltIn)
    testWithNonEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithBuiltIn)
  }

  test("testFindTheNumberOfElementsOfAListWithFoldLeft") {
    testWithEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithFoldLeft)
    testWithNonEmptyList(FindTheNumberOfElementsOfAList.findTheNumberOfElementsOfAListWithFoldLeft)
  }

  def testWithEmptyList(functionToTest: List[Any] => Any): Unit = assert(functionToTest(Nil) == 0)

  def testWithNonEmptyList(functionToTest: List[Any] => Any): Unit = assert(functionToTest(List(1, 2, 3)) == 3)
}

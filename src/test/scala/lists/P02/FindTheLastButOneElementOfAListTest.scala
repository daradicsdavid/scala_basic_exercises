package lists.P02

import java.util.NoSuchElementException

import lists.P02.FindTheLastButOneElementOfAList.{findTheLastButOneElementOfAListWithBuiltIn, findTheLastElementOfAListWithPatternMatchingAndRecursion}
import org.scalatest.FunSuite
import utils.ListUtils

class FindTheLastButOneElementOfAListTest extends FunSuite {


  test("testFindTheLastButOneElementOfAListWithBuiltIn") {
    testListWithNumber(findTheLastButOneElementOfAListWithBuiltIn)
    testListWithString(findTheLastButOneElementOfAListWithBuiltIn)
  }

  test("testFindTheLastButOneElementOfAListWithBuiltIn with empty list") {
    ListUtils testWithEmptyList(findTheLastButOneElementOfAListWithBuiltIn, classOf[NoSuchElementException])
  }

  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion") {
    testListWithNumber(findTheLastElementOfAListWithPatternMatchingAndRecursion)
    testListWithString(findTheLastElementOfAListWithPatternMatchingAndRecursion)
  }

  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion with empty list") {
    ListUtils testWithEmptyList(findTheLastElementOfAListWithPatternMatchingAndRecursion, classOf[NoSuchElementException])
  }


  def testListWithNumber(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List(1, 2, 3), 2)
  }

  def testListWithString(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List("A", "B", "C"), "B")
  }
}
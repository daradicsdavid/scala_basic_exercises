package lists.P02

import java.util.NoSuchElementException

import org.scalatest.FunSuite
import utils.ListUtils

class FindTheLastButOneElementOfAListTest extends FunSuite {


  test("testFindTheLastButOneElementOfAListWithBuiltIn") {
    testListWithNumber(FindTheLastButOneElementOfAList findTheLastButOneElementOfAListWithBuiltIn)
    testListWithString(FindTheLastButOneElementOfAList findTheLastButOneElementOfAListWithBuiltIn)
  }

  test("testFindTheLastButOneElementOfAListWithBuiltIn with empty list") {
    ListUtils testWithEmptyList(FindTheLastButOneElementOfAList findTheLastButOneElementOfAListWithBuiltIn, classOf[IndexOutOfBoundsException])
  }

  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion") {
    testListWithNumber(FindTheLastButOneElementOfAList findTheLastElementOfAListWithPatternMatchingAndRecursion)
    testListWithString(FindTheLastButOneElementOfAList findTheLastElementOfAListWithPatternMatchingAndRecursion)
  }

  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion with empty list") {
    ListUtils testWithEmptyList(FindTheLastButOneElementOfAList findTheLastElementOfAListWithPatternMatchingAndRecursion, classOf[NoSuchElementException])
  }


  def testListWithNumber(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List(1, 2, 3), 2)
  }

  def testListWithString(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List("A", "B", "C"), "B")
  }
}
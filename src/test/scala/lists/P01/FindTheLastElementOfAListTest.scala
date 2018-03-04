package lists.P01

import java.util.NoSuchElementException

import org.scalatest.FunSuite
import utils.ListUtils

class FindTheLastElementOfAListTest extends FunSuite {

  test("testFindTheLastElementOfAListWithBuiltIn") {
    testListWithNumber(FindTheLastElementOfAList findTheLastElementOfAListWithBuiltIn)
    testListWithString(FindTheLastElementOfAList findTheLastElementOfAListWithBuiltIn)
  }

  test("testFindTheLastElementOfAListWithBuiltIn with empy list") {
    ListUtils testWithEmptyList(FindTheLastElementOfAList findTheLastElementOfAListWithBuiltIn, classOf[NoSuchElementException])
  }

  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion") {
    testListWithNumber(FindTheLastElementOfAList findTheLastElementOfAListWithPatternMatchingAndRecursion)
    testListWithString(FindTheLastElementOfAList findTheLastElementOfAListWithBuiltIn)
  }


  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion with empy list") {
    ListUtils testWithEmptyList(FindTheLastElementOfAList findTheLastElementOfAListWithPatternMatchingAndRecursion, classOf[NoSuchElementException])
  }

  def testListWithNumber(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List(1, 2, 3), 3)
  }

  def testListWithString(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List("A", "B", "C"), "C")
  }
}

package lists.P01

import java.util.NoSuchElementException

import lists.P01.FindTheLastElementOfAList.{findTheLastElementOfAListWithBuiltIn, findTheLastElementOfAListWithPatternMatchingAndRecursion}
import org.scalatest.FunSuite
import utils.ListUtils

class FindTheLastElementOfAListTest extends FunSuite {

  test("testFindTheLastElementOfAListWithBuiltIn") {
    testListWithNumber(findTheLastElementOfAListWithBuiltIn)
    testListWithString(findTheLastElementOfAListWithBuiltIn)
  }

  test("testFindTheLastElementOfAListWithBuiltIn with empy list") {
    ListUtils testWithEmptyList(findTheLastElementOfAListWithBuiltIn, classOf[NoSuchElementException])
  }

  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion") {
    testListWithNumber(findTheLastElementOfAListWithPatternMatchingAndRecursion)
    testListWithString(findTheLastElementOfAListWithBuiltIn)
  }


  test("testFindTheLastElementOfAListWithPatternMatchingAndRecursion with empy list") {
    ListUtils testWithEmptyList(findTheLastElementOfAListWithPatternMatchingAndRecursion, classOf[NoSuchElementException])
  }

  def testListWithNumber(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List(1, 2, 3), 3)
  }

  def testListWithString(functionToTest: List[Any] => Any): Unit = {
    ListUtils.testList(functionToTest, List("A", "B", "C"), "C")
  }
}

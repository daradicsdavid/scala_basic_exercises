package utils

import org.scalatest.FunSuite

object ListUtils extends FunSuite {
  def testList(functionToTest: List[Any] => Any, inputList: List[Any], expectedResult: Any): Unit = {
    val result = functionToTest apply inputList

    assert(result == expectedResult)
  }

  def testWithEmptyList(functionToTest: List[Any] => Any, expectedExceptionType: Class[_ <: Exception]): Unit = {
    val exception = intercept[Exception] {
      functionToTest.apply(Nil)
    }

    assert(exception.getClass == expectedExceptionType)
  }
}

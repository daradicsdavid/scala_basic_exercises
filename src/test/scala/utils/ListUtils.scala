package utils

import org.scalatest.FunSuite

object ListUtils extends FunSuite {


  def testWithEmptyList(functionToTest: List[Any] => Any, expectedExceptionType: Class[_ <: Exception]): Unit = {
    testWithException(Nil, functionToTest, expectedExceptionType)
  }

  def testList(functionToTest: List[Any] => Any, inputList: List[Any], expectedResult: Any): Unit = {
    val result = functionToTest apply inputList

    assert(result == expectedResult)
  }

  def testWithException(param: List[Any], functionToTest: List[Any] => Any, expectedExceptionType: Class[_ <: Exception]): Unit = {
    val exception = intercept[Exception] {
      functionToTest.apply(param)
    }

    assert(exception.getClass == expectedExceptionType)
  }


}

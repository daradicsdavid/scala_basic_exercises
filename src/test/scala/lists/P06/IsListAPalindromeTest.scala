package lists.P06

import org.scalatest.FunSuite
import utils.ExecutionTimeUtils

import scala.collection.immutable.Nil

class IsListAPalindromeTest extends FunSuite {


  test("testIsPalindromeWithBuiltInWithoutView") {
    testWithEmptyVector(IsListAPalindrome.isPalindromeWithBuiltInWithoutView)
    testWithNonEmptyVector(IsListAPalindrome.isPalindromeWithBuiltInWithoutView)
  }

  test("testIsPalindromeWithBuiltInWithView") {
    testWithEmptyVector(IsListAPalindrome.isPalindromeWithBuiltInWithView)
    testWithNonEmptyVector(IsListAPalindrome.isPalindromeWithBuiltInWithView)
  }

  test("testIsPalindromeWithBuiltinExists") {
    testWithEmptyVector(IsListAPalindrome.isPalindromeWithBuiltinExists)
    testWithNonEmptyVector(IsListAPalindrome.isPalindromeWithBuiltinExists)
  }

  test("testIsPalindromeWithIteration") {
    testWithEmptyVector(IsListAPalindrome.isPalindromeWithIteration)
    testWithNonEmptyVector(IsListAPalindrome.isPalindromeWithIteration)
  }

  test("testIsPalindromeWithRecursive") {
    testWithEmptyVector(IsListAPalindrome.isPalindromeWithRecursive)
    testWithNonEmptyVector(IsListAPalindrome.isPalindromeWithRecursive)
  }


  def testWithEmptyVector(functionToTest: Vector[Any] => Boolean): Unit = {
    val result = functionToTest(Vector())

    assert(result)
  }

  def testWithNonEmptyVector(functionToTest: Vector[Any] => Boolean): Unit = {

    val palindromeList = Vector.range(1, 100) ++ Vector.range(1, 100).reverse
    val nonPalindromeList = Vector.range(1, 100) ++ Vector.range(1, 100).reverse.updated(0, 100)

    val palindromeResult = ExecutionTimeUtils time functionToTest(palindromeList)
    assert(palindromeResult)

    val nonPalindromeResult = functionToTest(nonPalindromeList)
    assert(!nonPalindromeResult)
  }
}

package lists.P06

import org.scalatest.FunSuite
import utils.ExecutionTimeUtils

import scala.collection.immutable.Nil

class IsListAPalindromeTest extends FunSuite {


  test("testIsPalindromeWithBuiltInWithoutView") {
    testWithEmptyList(IsListAPalindrome.isPalindromeWithBuiltInWithoutView)
    testWithNonEmptyList(IsListAPalindrome.isPalindromeWithBuiltInWithoutView)
  }

  test("testIsPalindromeWithBuiltInWithView") {
    testWithEmptyList(IsListAPalindrome.isPalindromeWithBuiltInWithView)
    testWithNonEmptyList(IsListAPalindrome.isPalindromeWithBuiltInWithView)
  }

  test("testIsPalindromeWithBuiltinExists") {
    testWithEmptyList(IsListAPalindrome.isPalindromeWithBuiltinExists)
    testWithNonEmptyList(IsListAPalindrome.isPalindromeWithBuiltinExists)
  }

  test("testIsPalindromeWithIteration") {
    testWithEmptyList(IsListAPalindrome.isPalindromeWithIteration)
    testWithNonEmptyList(IsListAPalindrome.isPalindromeWithIteration)
  }

  def testWithEmptyList(functionToTest: Vector[Any] => Boolean): Unit = {
    val result = functionToTest(Vector())

    assert(result)
  }

  def testWithNonEmptyList(functionToTest: Vector[Any] => Boolean): Unit = {

    val palindromeList = Vector.range(1, 100) ++ Vector.range(1, 100).reverse
    val nonPalindromeList = Vector.range(1, 100) ++ Vector.range(1, 100).reverse.updated(0, 100)

    val palindromeResult = ExecutionTimeUtils time functionToTest(palindromeList)
    assert(palindromeResult)

    val nonPalindromeResult = functionToTest(nonPalindromeList)
    assert(!nonPalindromeResult)
  }
}

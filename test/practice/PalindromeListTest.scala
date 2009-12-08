package practice

import org.junit._
class PalindromeListTest {
	def isPalindrome[T] (list : List[T]) {
		Assert.assertTrue(LearningLists.isPalindrome(list))
	}
	def notPalindrome[T] (list : List[T]) {
		Assert.assertFalse(LearningLists.isPalindrome(list))
	}
	@Test def emptyListIsPalindrome() = {
		isPalindrome(Nil)
	}
	@Test def singleItemListIsPalindrome() = {
		isPalindrome(List(1))
	}
	@Test def listWithTwoOfSameIsPalindrome() = {
		isPalindrome(List("a", "a"))
	}
	@Test def listWithTwoDifferentIsNotPalindrome() = {
		notPalindrome(List("a", "b"))
	}
	@Test def listWithThreeOfSameIsPalindrome() = {
		isPalindrome(List(1, 1, 1))
	}
	@Test def symmetricalThreeIsPalindrome() = {
		isPalindrome(List(1, 2, 1))
	}
}

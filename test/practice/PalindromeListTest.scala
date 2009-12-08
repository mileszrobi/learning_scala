package practice

import org.junit._
class PalindromeListTest {
	@Test
	def emptyListIsPalindrome() = {
		Assert.assertTrue(LearningLists.isPalindrome(Nil));
	}
}

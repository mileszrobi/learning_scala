package practice

import org.junit._

class PackConsecutiveDuplicatesIntoSublistTest {
	def verify(expected : List[Any], input : List[Any]) = {
		Assert.assertEquals(expected, LearningLists.packConsecutiveDuplicatesIntoSublist(input))
	} 
	
	@Test def nilMapsToNil = verify(Nil, Nil)
	
	@Test def listWithOneElementMapsToAListWithinTheList = verify(List(List(1)), List(1))
	
	@Test def listWithTwoConsecDupeElementsMapsToAListWithOneSublistContainingTheTwoConsecElements = 
		verify(List(List('a, 'a)), List('a, 'a))
		
	@Test def listWithTwoPairsMapsToAListWithTwoListsContainingThePairs =
		verify(List(List(1, 1), List(2, 2)), List(1, 1, 2, 2))
		
	@Test def onlyConsecutivesArePacked =
		verify(List(List(1, 1), List(2, 2), List(1)), List(1, 1, 2, 2, 1))
}

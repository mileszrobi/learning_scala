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
}

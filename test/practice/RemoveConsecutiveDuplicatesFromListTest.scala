package practice

import org.junit._

class RemoveConsecutiveDuplicatesFromListTest {
	def verify(expected : List[Any], input : List[Any]) = {
		Assert.assertEquals(expected, LearningLists.removeConsecutiveDuplicates(input))
	} 
	
	@Test def nilMapsToNil = verify(Nil, Nil)
	
	@Test def multiElemListWithNoDuplicatesMapsToSelf = verify(List(1, 2), List(1, 2))
	
	@Test def listOfSameValuesMapsToListOfOne = verify(List(1), List(1, 1, 1))
	
	@Test def onlyConsecutivesAreRemoved = verify(List(1, 2, 1, 2), List(1, 1, 2, 2, 1, 1, 1, 2))
}

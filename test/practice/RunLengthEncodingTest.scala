package practice

import org.junit._

class RunLengthEncodingTest {
	def verify(expected : List[Any], input : List[Any]) = {
		Assert.assertEquals(expected, LearningLists.runLengthEncode(input))
	} 
	
	@Test def nilMapsToNil = verify(Nil, Nil)
	
	@Test def singleElementListMapsToAListWithOnePair = 
		verify(List((1, 'a)), List('a))
				
	@Test def multiNoConsecDuplicates = verify(List((1, 'a), (1, 'b)), List('a, 'b))
	
	@Test def twoConsecDupes = verify(List((2, 'a), (2, 'b)), List('a, 'a, 'b, 'b))
	
	@Test def onlyConsecsAreMapped = verify(List((1, 'a), (1, 'b), (1, 'a)), List('a, 'b, 'a))
}

package practice

import org.junit._

class DuplicateListElementsTest {
	def verifyConversion[T](expectedOutput : List[T], givenInput : List[T]) = {
		Assert.assertEquals(expectedOutput, LearningLists.duplicateElements(givenInput))
	}
	
	@Test
	def nilDuplicatedIsNil = verifyConversion(Nil, Nil)
	
	@Test
	def singleElementDuplicated = verifyConversion(List('a, 'a), List('a));
			
	@Test
	def twoDifferentElementsBothDuplicated = verifyConversion(List(1, 1, 2, 2), List(1, 2))

}

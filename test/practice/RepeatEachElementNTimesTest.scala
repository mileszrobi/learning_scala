package practice

import org.junit._

class RepeatEachElementNTimesTest {
	def verifyConversion[T](expectedOutput : List[T], givenInput : List[T], count : Int) = {
		Assert.assertEquals(expectedOutput, LearningLists.repeatEachElement(givenInput, count))
	}
	
	@Test
	def nilDuplicatedIsNil = verifyConversion(Nil, Nil, 3)
	
	@Test
	def repeatingElementsOfANonEmptyListZeroTimesReturnsNil = verifyConversion(Nil, List(3, 3, 3, 3), 0)
	
	@Test(expected = classOf[Throwable])
	def repeatingElementsMinusNumberOfTimesIsNotInterpretedForNil : Unit = LearningLists.repeatEachElement(Nil, -3)
	
	@Test(expected = classOf[Throwable])
	def repeatingElementsMinusNumberOfTimesIsNotInterpretedForNonEmptyList : Unit = 
		LearningLists.repeatEachElement(List('s), -3)
	
	@Test
	def repeatingSingleElementList = verifyConversion(List('a, 'a, 'a), List('a), 3)
}

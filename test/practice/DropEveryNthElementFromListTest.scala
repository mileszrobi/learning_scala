package practice

import org.junit._

class DropEveryNthElementFromListTest {
	val sampleListOfFour = List(1, 2, 3, 4)
	
	def verifyConversion[T](expectedOutput : List[T], givenInput : List[T], n : Int) = {
		Assert.assertEquals(expectedOutput, LearningLists.dropEveryNth(givenInput, n))
	}
	
	@Test def droppingAnyNonNegativeNFromNilIsNil = for(i <- 0 to 10) verifyConversion(Nil, Nil, i)
	
	@Test def droppingEveryElementFromANonEmptyListIsNil = verifyConversion(Nil, sampleListOfFour, 1)
	
	@Test def droppingElementsWhereNIsGreaterThanSizeOfListReturnsOriginalList = 
		verifyConversion(sampleListOfFour, sampleListOfFour, 5)
		
	@Test def droppingEverySecondElementFromList =
		verifyConversion(List(1, 3), sampleListOfFour, 2)
		
	@Test def droppingNegativeReturnsNil  =
		verifyConversion(Nil, sampleListOfFour, -1)
		
	@Test def droppingEveryThirdElementFromAThreeElementArray =
		verifyConversion(List(1, 2, 4), sampleListOfFour, 3)
}

package practice

import org.junit._
@Ignore
class RunLengthEncodingDecodingExamples {
	// TODO: make this class abstract and stop junit from trying to run the abstract class 
	def verifyConversion[T](encoded : List[(Int, T)], decoded : List[T]) {}	
	
	@Test def nilMapsToNil = verifyConversion(Nil, Nil)
	
	@Test def singleElement = 
		verifyConversion(List((1, 'a)), List('a))
				
	@Test def multiNoConsecDuplicates = verifyConversion(List((1, 'a), (1, 'b)), List('a, 'b))
	
	@Test def singleDuplicate = verifyConversion(List((2, 'a)), List('a, 'a))
	
	@Test def twoConsecDupes = verifyConversion(List((2, 'a), (2, 'b)), List('a, 'a, 'b, 'b))
	
	@Test def noConsecutiveDuplicatesButSameElementIsPresentTwice = verifyConversion(List((1, 'a), (1, 'b), (1, 'a)), List('a, 'b, 'a))
	
	@Test def mixedConsecDuplicateFollowedByNonDuplicate = 
		verifyConversion(List((2, 'a), (1, 'b)), List('a, 'a, 'b))
}

class RunLengthEncodingTest extends RunLengthEncodingDecodingExamples {
	override
	def verifyConversion[T](encoded : List[(Int, T)], decoded : List[T]) = {
		Assert.assertEquals(encoded, LearningLists.runLengthEncode(decoded))
	} 
}

class RunLengthDecodingTest extends RunLengthEncodingTest {
	override 
	def verifyConversion[T](encoded : List[(Int, T)], decoded : List[T]) = {
		Assert.assertEquals(decoded, LearningLists.runLengthDecode(encoded))
	}
	
	@Test def zeroIndexedEncodedDecodesToEmptyList = verifyConversion(List((0, "a")), Nil)
}

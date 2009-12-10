package practice

import org.junit._

class RunLengthEncodingWithOnlyDupesToBecomingTuplesTest {
	def verify(expected : List[Any], input : List[Any]) = {
		Assert.assertEquals(expected, LearningLists.runLengthEncodeOnlyDupesToBecomeTuples(input))
	} 
	@Test def nilMapsToNil = verify(Nil, Nil)
	
	@Test def singleElemIsNotTuple = verify(List(1), List(1))
}

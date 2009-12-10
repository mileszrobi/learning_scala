package practice

import org.junit._

class RunLengthEncodingWithOnlyDupesToBecomingTuplesTest {
	def verify(expected : List[Any], input : List[Any]) = {
		Assert.assertEquals(expected, LearningLists.runLengthEncodeOnlyDupesToBecomeTuples(input))
	} 
	@Test def nilMapsToNil = verify(Nil, Nil)
	
	@Test def singleElemIsNotTuple = verify(List(1), List(1))
	
	@Test def pairMapsToAListOfOneTuple = verify(List((2, 'a)), List('a, 'a))
			
	@Test def mixedInputDupesAreTuplesNonDupesAreItems = verify(List('a, (3, 'b), (2, 'a)), List('a, 'b,'b,'b, 'a, 'a))
}

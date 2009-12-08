package practice

import org.junit._
class FlattenListTest {
	@Test def emptyList() = Assert.assertEquals(Nil, LearningLists.flatten(Nil))
	
	@Test def flatList() = Assert.assertEquals(List(1, 2, 3), LearningLists.flatten(List(1, 2, 3)))
	
	@Test def listContainingASingleNestedListIsFlattenedIntoNestedList = 
		Assert.assertEquals(List(1, 2, 3), LearningLists.flatten(List(List(1, 2, 3))))
		
	@Test def listOfTwoLists = Assert.assertEquals(List(1, 2, 3, 4), LearningLists.flatten(List(List(1, 2), List(3, 4))))
	
	@Test def deeplyNestedList = 
		Assert.assertEquals(List(1, 2, 3, 4, 5, 6, 7, 8, 9), 
				LearningLists.flatten(List(List(List(List(1, 2), 3, 4), 5, 6), 7, 8, 9)))
}

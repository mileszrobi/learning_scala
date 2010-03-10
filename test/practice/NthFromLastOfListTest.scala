
package practice


import org.junit._
class NthFromLastOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(None, LearningLists.nthFromLast(2, Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(None, LearningLists.nthFromLast(2, List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals(None, LearningLists.nthFromLast(2, List("hello")));
  }
  @Test
  def twoItemList() = {
    Assert.assertEquals(Some(3), LearningLists.nthFromLast(3, List(1, 1, 3, 1, 1)));
  }
  @Test
  def threeItemList() = {
    Assert.assertEquals(Some(1), LearningLists.nthFromLast(3, List(1, 2, 3)));
  }
  
  @Test
  def askingForZerothElementIsNone = {
	Assert.assertEquals(None,  LearningLists.nthFromLast(0, List()));
  }
  @Test 
  def negativeN() = {
	Assert.assertEquals(None,  LearningLists.nthFromLast(-1, List()));
  }
}

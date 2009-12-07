
package practice


import org.junit._
class NthFromLastOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(Nil, LearningLists.NthFromLast(2, Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(Nil, LearningLists.NthFromLast(2, List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals(Nil, LearningLists.NthFromLast(2, List("hello")));
  }
  @Test
  def twoItemList() = {
    Assert.assertEquals(3, LearningLists.NthFromLast(3, List(1, 1, 3, 1, 1)));
  }
  @Test
  def threeItemList() = {
    Assert.assertEquals(1, LearningLists.NthFromLast(3, List(1, 2, 3)));
  }
  
  @Test ( expected = classOf[NullPointerException] )
  def negativeN() : Unit = {
	  throw new NullPointerException()
	  //LearningLists.NthFromLast(-1, List());
  }
}

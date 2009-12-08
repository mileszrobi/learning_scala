package practice


import org.junit._
class PenultimateOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(None, LearningLists.lastButOf(Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(None, LearningLists.lastButOf(List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals(None, LearningLists.lastButOf(List("hello")));
  }
  @Test
  def twoItemList() = {
    Assert.assertEquals("first", LearningLists.lastButOf(List("first", "last")));
  }
  @Test
  def threeItemList() = {
    Assert.assertEquals(2, LearningLists.lastButOf(List(1, 2, 3)));
  }
}

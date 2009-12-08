package practice


import org.junit._
class PenultimateOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(None, LearningLists.LastButOf(Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(None, LearningLists.LastButOf(List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals(None, LearningLists.LastButOf(List("hello")));
  }
  @Test
  def twoItemList() = {
    Assert.assertEquals("first", LearningLists.LastButOf(List("first", "last")));
  }
  @Test
  def threeItemList() = {
    Assert.assertEquals(2, LearningLists.LastButOf(List(1, 2, 3)));
  }
}

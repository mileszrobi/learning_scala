package practice


import org.junit._
class PenultimateOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(Nil, LearningLists.LastButOf(Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(Nil, LearningLists.LastButOf(List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals(Nil, LearningLists.LastButOf(List("hello")));
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

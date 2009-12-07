package practice

import org.junit._

class LastOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(Nil, LearningLists.LastOf(Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(Nil, LearningLists.LastOf(List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals("hello", LearningLists.LastOf(List("hello")));
  }
  @Test
  def twoItemList() = {
    Assert.assertEquals("last", LearningLists.LastOf(List("first", "last")));
  }
}

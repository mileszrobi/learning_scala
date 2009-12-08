package practice

import org.junit._

class LastOfListTest {
  @Test
  def nilList() = {
    Assert.assertEquals(None, LearningLists.lastOf(Nil));
  }
  @Test
  def emptyList() = {
    Assert.assertEquals(None, LearningLists.lastOf(List[Int]()));
  }
  @Test
  def oneItemList() = {
    Assert.assertEquals("hello", LearningLists.lastOf(List("hello")));
  }
  @Test
  def twoItemList() = {
    Assert.assertEquals("last", LearningLists.lastOf(List("first", "last")));
  }
}

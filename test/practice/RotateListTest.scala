package practice

import org.junit._
import Assert._

class RotateListTest {
    def verify[T] (expected : List[T], input : List[T], n : Int) = {
        assertEquals(expected, LearningLists.rotate(n, input))
    }

    @Test
    def singleElementListRotatesToItself =
        verify(List('a), List('a), 1);

}

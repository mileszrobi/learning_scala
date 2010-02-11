package practice

import org.junit._
import Assert._

class RotateListTest {
    def verify[T] (expected : List[T], input : List[T], n : Int) = {
        assertEquals(expected, LearningLists.rotate(n, input))
    }

    def rotatesToItselfRegardlessOfTheNumberOfPlacesRotated 
        [T](input : List[T]) = 
            for(i <- -1 to 2)
                verify(input, input, i);


    @Test def emptyListRotatesToItselfAnyNumberOfPlaces =
        rotatesToItselfRegardlessOfTheNumberOfPlacesRotated (Nil)
    
    @Test def singleElementListRotatesToItselfAnyNumberOfPlaces =
        rotatesToItselfRegardlessOfTheNumberOfPlacesRotated (List('a))

    @Test def twoElementListRotatedByOneBecomesReverse = {
        val li = List(1, 2)
        verify(li.reverse, li, 1)
    }
}

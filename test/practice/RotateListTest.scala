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
    @Test def twoElementListRotatedByMinusOneBecomesReverse = {
        val li = List(1, 2)
        verify(li.reverse, li, -1)
    }

    @Test def twoElementListRotatedByTwoIsItself = {
        val li = List(1, 2)
        verify(li, li, 2)
    }
    @Test def twoElementListRotatedByMinusTwoIsItself = {
        val li = List(1, 2)
        verify(li, li, -2)
    }

    @Test def threeElementListRotatedByTwo =
        verify(List(3, 1, 2), List(1, 2, 3), 2)

    @Test def threeElementListRotatedByOne =
        verify(List(2, 3, 1), List(1, 2, 3), 1)
}

package practice

import org.junit._
import Assert._

class SliceLeftInclusiveRightExclusiveTest {
    def slice[T] (
        input : List[T],
        left : Int,
        right : Int
    ) = LearningLists.slice(input, left, right)

    def verify[T] (
        expectedResult : List[T],
        input : List[T],
        left : Int,
        right : Int
    ) = assertEquals(expectedResult, slice(input, left, right))

    @Test
    def singleElementListAllOfItSlicedEqualsToSelf =
        verify(List(1), List(1), 0, 1)

    @Test
    def twoElementListSlicedOneElementFromStartIsFirstElement =
        verify(List(1), List(1, 2), 0, 1)

    @Test
    def twoElementListSlicedOneElementAfterFirstIsLastElement =
        verify(List(2), List(1, 2), 1, 2)

    @Test
    def twoElementListSlicedTwoElementsFromStartEqualsToSelf =
        verify(List(1, 2), List(1, 2), 0, 2)
    @Test
    def threeElementListSlicedOneElementAfterStartEqualsMiddleElement =
        verify(List(2), List(1, 2, 3 ), 1, 2)
    @Test
    def threeElementListSlicedTwoElementAfterStartEqualsMiddleAndLastElement =
        verify(List(2, 3), List(1, 2, 3 ), 1, 3)

    @Test
    def ifLeftIsGreaterThanRightSliceEqualsNil =
        verify(Nil, List(1, 2, 3, 4, 5), 2, 1)
    @Test
    def ifLeftIsEqualToRightSliceEqualsNil =
        verify(Nil, List(1, 2, 3, 4, 5), 2, 2)
    @Test
    def ifLeftIsNegativeItIsSameAsSlicingFromZero = {
        val input = List(1, 2, 3, 4, 5)
        verify(slice(input, 0, 2), input, -2, 2)
    }

}

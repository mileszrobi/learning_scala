/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practice

import org.junit._
import Assert._

class SplitAListIntoTwoPartsBase {
    def verifyConversion[T](
        expectedResult: Tuple2[List[T], List[T]],
        indexToSplitAt : Int,
        inputList : List[T]
    ) = assertEquals(
        expectedResult,
        LearningLists.split(indexToSplitAt, inputList)
    )
}

class SplittingATwoElementListAtIndexOneResultsInTwoListsOfOneEachForAllTypesTest
        extends SplitAListIntoTwoPartsBase {

    def verifySplit[T] (first : T, second : T) =
        verifyConversion(
            (List(first), List(second)), 1, List(first, second)
        )
    @Test
    def symbols = verifySplit('a, 'b)
    @Test
    def ints = verifySplit(1, 2)
}
class SplittingAListOfSizeThreeTest extends SplitAListIntoTwoPartsBase {
    @Test
    def atSecond_ResultsInTuple_FirstSecond_Third = {
        val expectedResult = (List(1, 2), List(3))
        val indexToSplitAt = 2
        val inputList = List(1,2,3)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }
    @Test
    def atFirst_ResultsInTuple_First_SecondThird = {
        val expectedResult = (List(1), List(2, 3))
        val indexToSplitAt = 1
        val inputList = List(1,2,3)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }
}
class SplittingAFourElementListTest extends SplitAListIntoTwoPartsBase {
    @Test
    def atThree_ResultsInTuple_FirstSecondThird_Fourth ={
        val expectedResult = (List(1, 2, 3), List(4))
        val indexToSplitAt = 3
        val inputList = List(1, 2, 3, 4)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }
}

@Ignore
abstract class SplittingAtBoundaries extends SplitAListIntoTwoPartsBase {
    def verify [T] (input : List[T])

    @Test def emptyList = verify(Nil)

    @Test def oneElementList = verify(List(1))

    @Test def twoElementList = verify(List('a, 'b))

    @Test def threeElementList = verify(List(1, 2, 3))

    @Test def fourElementList = verify(List(1, 2, 3, 4))
}

class SplittingAtZerothElementResultsIn_Nil_InputListTest
        extends SplittingAtBoundaries {
        
    def verify [T] (input : List[T]) =
        verifyConversion((Nil, input), 0, input)
}

class SplittingAListAtEndOfListResultsIn_InputList_Nil_Test
        extends SplittingAtBoundaries {

    def verify [T] (input : List[T]) =
        verifyConversion((input, Nil), input.size, input)
}

class InvalidInputsTest extends SplitAListIntoTwoPartsBase {
    @Test
    def negativeIndexIsInterpretedAsSplittingAtZero = {
        val list = List(1, 2, 3)
        val expected = LearningLists.split(0, list)
        verifyConversion(expected, -1, list)
    }
    @Test
    def splittingAtIndexLargerThanInputLengthIsInterpretedAsSplittingAtEnd = {
        val list = List(1, 2, 3)
        val expected = LearningLists.split(list.length, list)
        verifyConversion(expected, list.length + 1, list)
    }
}
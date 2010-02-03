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
class SplittingAFourElementListTest extends SplitAListIntoTwoPartsBase {
    @Test
    def atThree_ResultsInTuple_FirstSecondThird_Fourth ={
        val expectedResult = (List(1, 2, 3), List(4))
        val indexToSplitAt = 3
        val inputList = List(1, 2, 3, 4)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practice

import org.junit._
import Assert._

class SplitAListIntoTwoPartsTest {
    def verifyConversion[T](
        expectedResult: Tuple2[List[T], List[T]],
        indexToSplitAt : Int,
        inputList : List[T]
    ) = assertEquals(
            expectedResult,
            LearningLists.split(indexToSplitAt, inputList)
        )

    class SplittingATwoElementListAtIndexOneResultsInTwoListsOfOneEachForAllTypes
            extends SplitAListIntoTwoPartsTest {

        def verifySplit[T] (first : T, second : T) =
            verifyConversion(
                (List(first), List(second)), 1, List(first, second)
            )
        @Test
        def symbols = verifySplit('a, 'b)
        @Test
        def ints = verifySplit(1, 2)
    }

    
    @Test
    def splittingAThreeElementListOfIntsAtTheSecondElement = {
        val expectedResult = (List(1, 2), List(3))
        val indexToSplitAt = 2
        val inputList = List(1,2,3)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }

}

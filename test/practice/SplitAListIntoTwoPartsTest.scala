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
    @Test
    def splittingATwoElementListOfSymbols = {
        val expectedResult = (List('a), List('b))
        val indexToSplitAt = 1
        val inputList = List('a, 'b)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }
    @Test
    def splittingATwoElementListOfInts = {
        val expectedResult = (List(1), List(2))
        val indexToSplitAt = 1
        val inputList = List(1,2)
        verifyConversion(expectedResult, indexToSplitAt, inputList)
    }

}

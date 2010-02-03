/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practice

import org.junit._
import Assert._

class SplitAListIntoTwoPartsTest {
    @Test
    def splittingATwoElementList = {
        assertEquals((List('a), List('b)), LearningLists.split(1, List('a, 'b)))
    }

}

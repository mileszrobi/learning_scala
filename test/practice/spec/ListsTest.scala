package practice.spec

import practice._
import org.concordion.integration.junit3.ConcordionTestCase

class SplitResult (firstName : String, lastName : String ) {
    def getFirstName = firstName;
    def getLastName = lastName;
}


//@RunWith(classOf[ConcordionRunner])
class ListsTest extends ConcordionTestCase {
    def lastOf (input : String) = "Blah" //LearningLists.lastOf(Nil).mkString;

    def split (input : String) = {
        var r = input.split(' ');
        new SplitResult(r(0), r(1));
    }
}
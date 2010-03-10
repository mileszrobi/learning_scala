package practice.spec

import practice._
import org.junit.runner.RunWith
import org.concordion.integration.junit4.ConcordionRunner

class SplitResult (firstName : String, lastName : String ) {
    def getFirstName = firstName;
    def getLastName = lastName;
}


@RunWith(classOf[ConcordionRunner])
class ListsTest {
    def lastOf (input : String) = "Blah" //LearningLists.lastOf(Nil).mkString;

    def split (input : String) = {
        var r = input.split(' ');
        new SplitResult(r(0), r(1));
    }
}
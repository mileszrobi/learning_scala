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

    implicit def csv2list(x: String) = List(x.split(",") : _*)

    def findLast (input : String) = LearningLists.lastOf(input).toString

    def split (input : String) = {
        var r = input.split(' ');
        new SplitResult(r(0), r(1));
    }
}
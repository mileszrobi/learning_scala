package practice.spec

import practice._
import org.junit.runner.RunWith
import org.junit._
import org.concordion.integration.junit4.ConcordionRunner

class SplitResult (firstName : String, lastName : String ) {
    def getFirstName = firstName;
    def getLastName = lastName;
}


@RunWith(classOf[ConcordionRunner])
class ListsTest {

    implicit def csv2list(x: String) = if(x == "") Nil else List(x.split(",") : _*)

    implicit def none2string[T](x : Option[T]) = x match {
        case None => "None"
        case Some(y) => y.toString
    }

    def findLast (input : String) = none2string ( LearningLists.lastOf(input))

    def split (input : String) = {
        Assert.assertEquals("empty string is not converted to nil", Nil, csv2list(""))
        var r = input.split(' ');
        new SplitResult(r(0), r(1));
    }
}
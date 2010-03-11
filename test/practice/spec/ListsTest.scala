package practice.spec

import practice._
import org.junit.runner.RunWith
import org.junit._
import org.concordion.integration.junit4.ConcordionRunner

@RunWith(classOf[ConcordionRunner])
class ListsTest {
  implicit def csv2list(x: String) = if(x == "") Nil else List(x.split(" *, *") : _*)

  implicit def none2string[T](x : Option[T]) = x match {
    case None => "None"
    case Some(y) => y.toString
  }
  
  def findLast (input : String) = none2string (LearningLists.lastOf(input))

  def penultimate (input : String) = none2string (LearningLists.lastButOf(input))

  def nthFromLast (n : Int, input : String) = none2string (LearningLists.nthFromLast(n, input))

  def isPalindrome (input : String) = LearningLists.isPalindrome(input)
}
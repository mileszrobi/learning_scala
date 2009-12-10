package practice

object LearningLists {
	def removeConsecutiveDuplicates[T](input : List[T]) : List[T] = {
		def actualImpl [T] (result : List[T], input : List[T]) : List[T] = input match {
			case head :: tail => actualImpl(head :: result, tail.dropWhile(_ == head))
			// this is tail recursive, hence if runtime is O(2n) instead of O(n) would matter
			// stack would have overflowed already
			case Nil => result.reverse
		}
		actualImpl(Nil, input)
	}
	def flatten (list : List[Any]) : List[Any] = {
		if (list.isEmpty) 
			Nil 
		else list.head match {
			case x:List[Any] => flatten(x):::flatten(list.tail)
			case _ => list.head::flatten(list.tail)
		}
	}
			
	def isPalindrome[T] (list : List[T]) = list == list.reverse 
	
	def lastOf[T] (list : List[T]) = nthFromLast(1, list)
	
	def lastButOf[T] (list : List[T]) = nthFromLast(2, list)
	
	// TODO: fix return type to be T
	def nthFromLast[T] (n : Int, list : List[T]) =  n match {
		case x if 1 to list.size contains n => list.reverse(n - 1)
		case _ =>  None
	}	
}
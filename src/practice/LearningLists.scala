package practice

object LearningLists {
	def LastOf[T] (list : List[T]) = NthFromLast(1, list)
	
	def LastButOf[T] (list : List[T]) = NthFromLast(2, list)
	
	// TODO: fix return type to be T
	def NthFromLast[T] (n : Int, list : List[T]) =  n match {
		case x if 1 to list.size contains n => list.reverse(n - 1)
		case _ =>  None
	}
}

package practice

object LearningLists {
	def LastOf[T] (list : List[T]) = {
		list.size match {
			case 0 => Nil
			case nonZero => list.last
		}
	}
	
	def LastButOf[T] (list : List[T]) = {
		list.size match {
			case 0 | 1 => Nil
			case nonZero => list.reverse(1)
		}
	}
	
	def NthFromLast[T] (n : Int, list : List[T]) = {
		list.size match {
			case x if (x < n) => Nil
			case _ => list.reverse(n - 1)
		}
	}
}

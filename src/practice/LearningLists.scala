package practice

object LearningLists {
    /// left: inclusive, right: not included in result
    def slice[T](
        input : List[T],
        left : Int,
        right : Int
    ) = if(right - left == 1) List(input(left))
        else List(input(left), input(left + 1))
    
    def split[T](firstLength : Int, input : List[T]) : Tuple2[List[T], List[T]] =
        if(firstLength <= 0) (Nil, input)
        else if (firstLength >= input.length) (input, Nil)
        else {
            val (h, t) = split(firstLength - 1, input.tail)
            (input.head :: h, t)
        }
        
	def dropEveryNth[T](input : List[T], n : Int) : List[T] =
		if(n <= 1 || input == Nil) Nil
		else { 
                val (firstN, tail) = input.splitAt(n);
				firstN.slice(0, n -1) ::: dropEveryNth(tail, n)
		}
		
	def repeatEachElement[T](input : List[T], count : Int) : List[T] = { 
		if (count < 0)
			throw new Exception()
		input.flatMap(x => List.make(count, x))
	}
	
	def duplicateElements[T](input : List[T]) : List[T] = repeatEachElement(input, 2)
	
	def runLengthEncodeOnlyDupesToBecomeTuples[T](input : List[T]) : List[Any] = packConsecutiveDuplicatesIntoSublist(input).map(
			x => if(x.length == 1) x.head else (x.length, x.head)
			)
	
	def runLengthEncode[T](input : List[T]) : List[(Int, T)] = packConsecutiveDuplicatesIntoSublist(input).map(x => (x.length, x(0)))
	
	def runLengthDecode [T](input : List[(Int, T)]) : List[T] = input match {
		case Nil => Nil
		case (count, element) :: tail => List.make(count, element) ::: runLengthDecode(tail)
	}
	
	def packConsecutiveDuplicatesIntoSublist[T](input : List[T]) : List[List[T]] = input match {
		case Nil => Nil
		case head :: tail => {
			val (headConsecsInList, tail) = input.span(_ == head)
			headConsecsInList :: packConsecutiveDuplicatesIntoSublist(tail)
		}
	}
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
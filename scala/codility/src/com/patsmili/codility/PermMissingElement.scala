package com.patsmili.codility

'''
find the only missing element from the array containing integers in range 1..(idx+1)
'''

object PermMissingElement{
	def solution(arr: Array[Int]): Int = {

		@scala.annotation.tailrec
		def findMissing(idx: Int, lst: List[Int]): Int = {
			if (lst.isEmpty || lst.head != idx + 1) idx + 1
			else findMissing(idx + 1, lst.tail)
		}
		if (arr.length == 0) 1
		else findMissing(0, A.toList.sorted) //  sorted
	}
}
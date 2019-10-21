
package com.patsmili.codility

'''
A non-empty array A consisting of N integers is given.
A permutation is a sequence containing each element from 1 to N once, and only once.
check if array is permutation
'''

object PermCheck{
	def solution(arr: Array[Int]): Int = {

		@scala.annotation.tailrec
		def isPerm(lst: List[Int]): Int = {
			if (lst.tail.isEmpty) 1
			else if (lst.tail.head != lst.head + 1) 0
			else isPerm(lst.tail)
		}

		val list: List[Int] = arr.toList.sorted
		if (list.head != 1) 0
		else if (list.last != list.size) 0
		else isPerm(list)
	}
}
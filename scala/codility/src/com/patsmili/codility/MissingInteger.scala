package com.patsmili.codility

'''
to find the minimum positive integer missing in the sequence.
'''

object MissingInteger{
	def solution(A: Array[Int]): Int = {
		def findMissing(in: Int, l: List[Int]): Int = {
			if (l.isEmpty || l.head != in) in
			else findMissing(in + 1, l.tail)
		}
		findMissing(1, A.toList.filter(_ > 0).distinct.sorted)
	}
}
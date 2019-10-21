package com.patsmili.codility

'''
'''

object FrogRiverOne{
	def solution(X: Int, A: Array[Int]): Int = {
		val pos: Array[Int] = Array.ofDim(X + 1)

		def areAllLeavesInPlace = {
			def rec(i: Int): Boolean = {
				if (i == X + 1) true
				else if (pos(i) == 0) false
				else rec(i + 1)
			}
			rec(1)
		}

		def findTime(step: Int, L: List[Int]): Int = {
			if (L.isEmpty) -1
			else {
				pos(L.head) = pos(L.head) + 1
				if (areAllLeavesInPlace) step
				else findTime(step + 1, L.tail)
			}
		}

		findTime(0, A.toList)
	}
}
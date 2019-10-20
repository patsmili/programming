package com.patsmili.codility

'''
Count minimal number of jumps from position X to Y
'''

object FrogJump{
	def solution(X: Int, Y: Int, D: Int): Int = {
		val distance: Long = Y - X
		val minimum = distance / D
		if (distance % D > 0) (minimum + 1).toInt
		else minimum.toInt
	}
}
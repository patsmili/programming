package com.patsmili.codility

'''
Count minimal number of jumps from position initialLoc to targetLoc
'''

object FrogJump{
	def solution(intialLoc: Int, targetLoc: Int, stepJump: Int): Int = {
		val distance: Long = targetLoc - intialLoc
		val minimumJmp = distance / stepJump
		if (distance % stepJump > 0) (minimumJmp + 1).toInt
		else minimumJmp.toInt
	}
}
package com.patsmili.codility

'''
to find the absolute minimum between subarrays when an array is split into 2 
'''

object TapeEquilibrium{
	def solution(A: Array[Int]): Int = {
		val sum = A.sum

		def getAbsDiff(sumLeft: Int, sumRight: Int): Int = Math.abs(sumLeft - sumRight)

		def getAbsMinDiffBetwSubArray(idx: Int, sumLeft: Int, curMin: Int): Int =
			if (idx == A.length) curMin
			else getAbsMinDiffBetwSubArray(idx + 1, 
				sumLeft + A(idx - 1), 
				Math.min(curMin, getAbsDiff(sumLeft, sum - sumLeft)))

		getAbsMinDiffBetwSubArray(2, A(0), getAbsDiff(A(0), sum - A(0)))
	}
}
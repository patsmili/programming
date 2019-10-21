package com.patsmili.codility

'''
count the number of cars passing each other.
An array consisting of consecutive cars travelling east or west, 0 for east and 1 for west.
For example, consider array A such that:

A[0] = 0
A[1] = 1
A[2] = 0
A[3] = 1
A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).
'''

object PassingCars{
	def solution(arr: Array[Int]): Int = {

		@scala.annotation.tailrec
		def getPassingCars(index: Int, numEast: Int, accum: Int): Int = {
			if (accum > 1000000000) -1
			else if (index >= arr.length) accum
			else if (arr(index) == 0) getPassingCars(index + 1, numEast + 1, accum)
				else getPassingCars(index + 1, numEast, accum + numEast)
		}

		getPassingCars(0, 0, 0)
	}
}
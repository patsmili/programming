package com.patsmili.codility

'''
Rotate an array to the right by a given number of steps.
'''

object CyclicRotation{
	def solution(arr: Array[Int], steps: Int): Array[Int] = {
		
		@scala.annotation.tailrec
		def rotateSteps(lst: List[Int], steps: Int): List[Int] = {
			
			def rotateOneStep(lst: List[Int]) = {
				lst.take(lst.size - 1).+:(lst.last)
			}

			if (steps == 0) lst
			else rotateSteps(rotateOneStep(lst), steps - 1)
		}

		if (arr.isEmpty) arr
		else rotateSteps(arr.toList, steps).toArray
	}
}
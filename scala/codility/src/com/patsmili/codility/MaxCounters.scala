package com.patsmili.codility


'''
https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
Calculate the values of counters after applying all alternating operations: 
increase counter by 1; set value of all counters to current maximum.

A non-empty array A of M integers is given. This array represents consecutive operations:

if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
if A[K] = N + 1 then operation K is max counter.
'''

object MaxCounters{
	def solution(N: Int, A: Array[Int]): Array[Int] = {
		val counters: Array[Int] = Array.ofDim(N)

		// incerease the value at counter index x - 1 by one
		def increaseCounter(x: Int) = counters(x - 1) = counters(x - 1) + 1

		def maxCounters() = {
			val max = counters.max
			for (i <- counters.indices) counters(i) = max
		}

		def getCounters(ops: List[Int]): Array[Int] = {
			if (ops.isEmpty) counters
			else {
					ops.head match {
						case x: Int if x >= 1 && x != (N + 1) => increaseCounter(x)
						case x: Int if x == (N + 1) => maxCounters()
					}
				getCounters(ops.tail)
			}
		}

		getCounters(A.toList)
	}
}
package com.patsmili.codility

'''
get the size of longest sequence of zeros in a binary representation of an integer.

'''

object BinaryGap extends App{
	def getBinaryGap(num : Int) : Int = {
    val list = "(?<=1)0+(?=1)".r.findAllIn(N.toBinaryString).toList
    if (list.isEmpty) 0
    else list.maxBy(_.length).length
	}

  println("6=>" + 6.toBinaryString + "=>" + getBinaryGap(6))
  println("9=>" + 9.toBinaryString + "=>" + getBinaryGap(9))
  println("15=>" + 15.toBinaryString + "=>" + getBinaryGap(15))
  println("22=>" + 22.toBinaryString + "=>" + getBinaryGap(22))
  println("325=>" + 325.toBinaryString + "=>" + getBinaryGap(325))
  println("540=>" + 540.toBinaryString + "=>" + getBinaryGap(540))
  println("2789=>" + 2789.toBinaryString + "=>" + getBinaryGap(2789))
  println("3549=>" + 3549.toBinaryString + "=>" + getBinaryGap(3549))
  println("952379=>" + 952379.toBinaryString + "=>" + getBinaryGap(952379))
}
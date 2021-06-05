package com.Bridgelabz.genricsjava;

/***********
 * 
 * @author ANAND
 * purpose:finding Integer Maximum number
 *
 *****8*****/
public class MaxInteger {

	// compute of find max number using compareTo method and Integer object.
	public Integer testMax(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}
}

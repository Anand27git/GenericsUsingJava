package com.Bridgelabz.genricsjava;

/***********
 * 
 * @author ANAND
 * purpose:finding Float Maximum number
 *
 *****8*****/
public class MaxFloat {

	public static Double testMax2(Double a, Double b, Double c) {
		Double max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		printMAX(a,b,c,max);
		return max;
}
	private static void printMAX(Double a, Double b, Double c, Double max) {
		// print max value
		System.out.printf("max of %s,%s and %s is %s\n",a,b,c,max);
	}
	
	public static void main(String[] args)
	{
		double maxnumber = testMax2((double) 5.0,2.1,2.0);
	System.out.println(maxnumber);
	}
	}

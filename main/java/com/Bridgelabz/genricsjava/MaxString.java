package com.Bridgelabz.genricsjava;

public class MaxString {

	/***********
	 * 
	 * @author ANAND
	 * purpose:finding  Maximum String
	 *
	 **********/
		public static String testMax2(String a, String b, String c) {
			String max = a;
			if (b.compareTo(max) > 0) {
				max = b;
			}
			if (c.compareTo(max) > 0) {
				max = c;
			}
			printMAX(a,b,c,max);
			return max;
	}
		private static void printMAX(String a, String b, String c, String max) {
			// print max value
			System.out.printf("max of %s,%s and %s max is: ",a,b,c,max);
		}
		
		public static void main(String[] args)
		{
			String maxstring = testMax2((String) "jeep","car","bus");
		System.out.println(maxstring);
		}
}

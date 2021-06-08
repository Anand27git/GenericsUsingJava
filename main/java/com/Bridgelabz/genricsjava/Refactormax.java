package com.Bridgelabz.genricsjava;

/**********
 * 
 * @author ANAND 
 * purpose : Refactoring the code for all Integer Float and String
 * Adding morethan 3 parameters
 * 
 *********/

public class Refactormax {

	/******
	 * 
	 * @param <T>
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	// Using comparative methods
	public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
		T max = elements[0];
		for (T maximumParameter : elements) {
			if (maximumParameter.compareTo(max) > 0) {
				max = maximumParameter;
			}
		}
		return max;
	}

	public static void main(String args[]) {

		int a = checkMaximum(65, 89, 78);
		System.out.println(a);

		float b = checkMaximum(3.6f, 2.5f, 9.7f);
		System.out.println(b);

		String c = checkMaximum("Apple", "Peach", "Banana");
		System.out.println(c);

		// Passing a More than 3 Parameter to the Integer,Float,String

		Integer a1 = checkMaximum_With_MoreThan_ThreeParameters(75, 85, 44, 20, 8);
		System.out.println(a1); // More than three Parameter

		Float b1 = checkMaximum_With_MoreThan_ThreeParameters(2.2f, 8.3f, 7.4f, 9.7f, 4.6f);
		System.out.println(b1);

		String c1 = checkMaximum_With_MoreThan_ThreeParameters("Banana", "Orange", "Mango", "Peach", "jackfruit");
		System.out.println(c1);

	}
}

package com.Bridgelabz.genricsjava;

import org.junit.Test;

/***************************
 * 
 * 
 * @author : ANAND 
 * purpose : checking TestCases for Maximum of String
 *
 * 
 ***************************/
public class Testcases {
	
	Refactormax maximumNum = new Refactormax();

	@Test
	public void givenMaxNumAtFirstPosition_ShouldReturnSameNum() {
		Integer maximumNum = Refactormax.checkMaximum(65, 78, 89);
		Assertions.assertEquals(65, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxNumAtSecondPosition_ShouldReturnSameNum() {
		Integer maximumNum = Refactormax.checkMaximum(65, 78, 89);
		Assertions.assertEquals(78, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxNumAtThirdPosition_ShouldReturnSameNum() {
		Integer maximumNum = Refactormax.checkMaximum(65, 78, 89);
		Assertions.assertEquals(89, maximumNum);
		System.out.println(maximumNum);
	}

	// Testing a Float Value in JUnit
	@Test
	public void givenMaxFloatNumAtFirstPosition_ShouldReturnSameNum() {
		Float maximumNum = Refactormax.checkMaximum(3.6f, 2.5f, 9.7f);
		Assertions.assertEquals(2.5f, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxFloatNumAtSecondPosition_ShouldReturnSameNum() {
		Float maximumNum = Refactormax.checkMaximum(3.6f, 2.5f, 9.7f);
		Assertions.assertEquals(3.6f, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxFloatNumAtThirdPosition_ShouldReturnSameNum() {
		Float maximumNum = Refactormax.checkMaximum(3.6f, 2.5f, 9.7f);
		Assertions.assertEquals(9.7f, maximumNum);
		System.out.println(maximumNum);
	}

	// Testing a String Value in JUnit
	@Test
	public void givenMaxStringNumAtFirstPosition_ShouldReturnSameNum() {
		String maximumNum = Refactormax.checkMaximum("Apple", "Peach", "Banana");
		Assertions.assertEquals("Apple", maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxStringNumAtSecondPosition_ShouldReturnSameNum() {
		String maximumNum = Refactormax.checkMaximum("Apple", "Peach", "Banana");
		Assertions.assertEquals("Peach", maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxStringNumAtThirdPosition_ShouldReturnSameNum() {
		String maximumNum = Refactormax.checkMaximum("Apple", "Peach", "Banana");
		Assertions.assertEquals("Banana", maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMoreParameterNumAtFirstPosition_ShouldReturnSameNum() {
		Integer maximumNum = Refactormax.checkMaximum_With_MoreThan_ThreeParameters(75, 85, 44, 20, 8);
		Assertions.assertEquals(20, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMoreFloatNumAtFirstPosition_ShouldReturnSameNum() {
		Float maximumNum = Refactormax.checkMaximum_With_MoreThan_ThreeParameters(2.2f, 8.3f, 7.4f, 9.7f, 4.6f);
		Assertions.assertEquals(7.4f, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMoreStringNumAtFirstPosition_ShouldReturnSameNum() {
		String maximumNum = Refactormax.checkMaximum_With_MoreThan_ThreeParameters("Banana", "Orange", "Mango", "Peach",
				"jackfruit");
		Assertions.assertEquals("Banana", maximumNum);
		System.out.println(maximumNum);
	}

}

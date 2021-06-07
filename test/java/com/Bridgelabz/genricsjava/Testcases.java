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
	MaxString maximumNum = new MaxString();

	@Test
	public void givenMaxNumAtFirstPosition_ShouldReturnSameNum() {
		String maximumstr = (String)MaxString.testMax2("anand", "chethan", "balaji");
		Assertions.assertEquals("anand", maximumstr);
		System.out.println(maximumstr);
	}

	@Test
	public void givenMaxNumAtSecondPosition_ShouldReturnSameNum() {
		String maximumstr = (String)MaxString.testMax2("Apple","peach","banana");
		Assertions.assertEquals("peach", maximumstr);
		System.out.println(maximumstr);
	}

	@Test
	public void givenMaxNumAtThirdPosition_ShouldReturnSameNum() {
		String maximumNum = MaxString.testMax2("duke","royal","apachi");
		Assertions.assertEquals("duke", maximumNum);
		System.out.println(maximumNum);
	}
}
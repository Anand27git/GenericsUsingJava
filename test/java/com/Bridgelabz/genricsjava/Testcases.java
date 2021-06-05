package com.Bridgelabz.genricsjava;

import org.junit.Test;

/***************************
 * 
 * 
 * @author : ANAND 
 * purpose : checking TestCases for Maximum of Integer
 *
 * 
 ***************************/
public class Testcases {
	MaxInteger maxNum = new MaxInteger();

	@Test
	public void givenMaxNumAtFirstPosition_ShouldReturnSameNum() {
		Integer maximumNum = maxNum.testMax(4, 5, 3);
		Assertions.assertEquals(4, maximumNum);
	}

	@Test
	public void givenMaxNumAtSecondPosition_ShouldReturnSameNum() {
		Integer maximumNum = maxNum.testMax(4, 5, 3);
		Assertions.assertEquals(5, maximumNum);
	}

	@Test
	public void givenMaxNumAtThirdPosition_ShouldReturnSameNum() {
		Integer maximumNum = maxNum.testMax(4, 5, 3);
		Assertions.assertEquals(3, maximumNum);
	}
}
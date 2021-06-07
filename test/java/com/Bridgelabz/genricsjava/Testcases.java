package com.Bridgelabz.genricsjava;

import org.junit.Test;

/***************************
 * 
 * 
 * @author : ANAND 
 * purpose : checking TestCases for Maximum of Float
 *
 * 
 ***************************/
public class Testcases {
	MaxFloat maxNum = new MaxFloat();

	@Test
	public void givenMaxNumAtFirstPosition_ShouldReturnSameNum() {
		Double maximumNum = MaxInteger.testMax2(4.1, 5.1, 3.1);
		Assertions.assertEquals(3.1, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxNumAtSecondPosition_ShouldReturnSameNum() {
		Double maximumNum = MaxInteger.testMax2(4.1,5.1,2.1);
		Assertions.assertEquals(2.1, maximumNum);
		System.out.println(maximumNum);
	}

	@Test
	public void givenMaxNumAtThirdPosition_ShouldReturnSameNum() {
		Double maximumNum = MaxInteger.testMax2(2.1, 10.2, 3.1);
		Assertions.assertEquals(3.1, maximumNum);
		System.out.println(maximumNum);
	}
}
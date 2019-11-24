package com.test.numberstoword;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumbersToWordsTest {

	@Test
	public void nuberBelow10() {
		assertEquals("zero", expectedOutput(0));
		assertEquals("one", expectedOutput(1));
		assertEquals("two", expectedOutput(2));
		assertEquals("three", expectedOutput(3));
		assertEquals("four", expectedOutput(4));
		assertEquals("five", expectedOutput(5));
		assertEquals("six", expectedOutput(6));
		assertEquals("seven", expectedOutput(7));
		assertEquals("eight", expectedOutput(8));
		assertEquals("nine", expectedOutput(9));
		
		
	}

	@Test
	public void nuberBelow20() {
		assertEquals("fifteen", expectedOutput(15));
		assertEquals("eleven", expectedOutput(11));
		assertEquals("eighteen", expectedOutput(18));
	}
	
	@Test
	public void multipleOf10() {
		assertEquals("ten", expectedOutput(10));
		assertEquals("twenty", expectedOutput(20));
		assertEquals("thirty", expectedOutput(30));
		assertEquals("forty", expectedOutput(40));
		assertEquals("fifty", expectedOutput(50));
		assertEquals("sixty", expectedOutput(60));
		assertEquals("seventy", expectedOutput(70));
		assertEquals("eighty", expectedOutput(80));
		assertEquals("ninety", expectedOutput(90));
	}

	@Test
	public void nuberBelow100() {
		assertEquals("ninety one", expectedOutput(91));
	}

	@Test
	public void nuberBelow1000() {
		assertEquals("nine hundred and ninety one", expectedOutput(991));
	}

	@Test
	public void convertsArbitraryTwoDigitNumbers() {
		assertEquals("forty two", expectedOutput(42));
		assertEquals("sixty nine", expectedOutput(69));
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", expectedOutput(56945781));
		 
	}

	@Test
	public void nuberwithMaxLimit() {
		assertEquals(
				"nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine",
				expectedOutput(999999999));
	}

	@Test(expected = IllegalArgumentException.class)
	public void rejectsNumbersOver999999999() {
		expectedOutput(1000000000);
	}
	
	private static String expectedOutput(int number) {
		return NumbersToWords.convert(number);
	}
	
	

}

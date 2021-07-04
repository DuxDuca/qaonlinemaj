package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import basics.Calculator;

 public class CalculatorTest {

	//private static Calculator calculator = new Calculator(); 
	
	@Test
	 public void testAdditionOfPositiveNumbers() {
		
		int a =2;
		int b=3;
		
		int expectedResult=5;
		int actualResult=Calculator.addNumbers(a, b);
		
		assertEquals(actualResult,expectedResult);
	 
	}
	@Test
	 public void testAdditionOfNegativeNumbers() {
		
		int a =-2;
		int b=-3;
		
		int expectedResult=65;
		int actualResult=Calculator.addNumbers(a, b);
		
		assertEquals(actualResult,expectedResult);

}

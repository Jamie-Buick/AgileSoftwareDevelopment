package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfTests {

	@Test
	void test1() {
		SumOfClass calculator = new SumOfClass();	
		
		int val1 = 5;
		int val2 = 5;
		
		int sum = calculator.sumInt(val1, val2);
		
		assertEquals(10, sum);

	}
	
	@Test
	void test2() {
		SumOfClass calculator = new SumOfClass();	
		
		int val1 = 3;
		int val2 = 4;
		
		int sum = calculator.sumInt(val1, val2);
		
		assertEquals(7, sum);

	}

}

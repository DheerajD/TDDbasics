package io.dheerajd;


import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathUtils = new MathUtils();

	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testDivide() {
		Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
	}

}

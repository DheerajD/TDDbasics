package io.dheerajd;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	void testAdd() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void testSubtract() {
		Assertions.assertEquals(0, mathUtils.subtract(1,1));
	}
	
	@Test
	void testDivide() {
		Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
	}

	@Test
	void testMultiply() {
		Assertions.assertEquals(10, mathUtils.multiply(5, 2));
	}
	
}

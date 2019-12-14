package io.dheerajd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void computeCircleAreaTest() {
		MathUtils mathUtils = new MathUtils();
		int expectedArea = 314;
		assertEquals(expectedArea, mathUtils.computeCircleArea(10));
	}

}

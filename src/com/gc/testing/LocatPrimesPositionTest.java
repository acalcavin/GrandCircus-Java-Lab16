package com.gc.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocatPrimesPositionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testReturnPrime6() {
		int expected = 13;
		int actual = LocatePrimes.returnPrime(6);
		assertEquals(expected, actual, "returnPrime6");
	}

	@Test
	void testReturnPrime10() {
		int expected = 29;
		int actual = LocatePrimes.returnPrime(10);
		assertEquals(expected, actual, "returnPrime10");
	}
}

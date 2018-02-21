package com.gc.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LocatePrimesTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testCheckIfPrime1() {
		boolean test = LocatePrimes.checkIfPrime(1);
		assertFalse(test, "checkIfPrime1");
	}
	
	@Test
	void testCheckIfPrime2() {
		boolean test = LocatePrimes.checkIfPrime(2);
		assertTrue(test, "checkIfPrime2");
	}
	
	@Test
	void testCheckIfPrime4() {
		boolean test = LocatePrimes.checkIfPrime(4);
		assertFalse(test, "checkIfPrime4");
	}

	@Test
	void testCheckIfPrime3() {
		boolean test = LocatePrimes.checkIfPrime(3);
		assertTrue(test, "checkIfPrime3");
	}
	
	@Test
	void testCheckIfPrime9() {
		boolean test = LocatePrimes.checkIfPrime(4);
		assertFalse(test, "checkIfPrime9");
	}
	

	@Test
	void testCheckIfPrime5() {
		boolean test = LocatePrimes.checkIfPrime(5);
		assertTrue(test, "checkIfPrime3");
	}
	
	@Test
	void testCheckIfPrime15() {
		boolean test = LocatePrimes.checkIfPrime(15);
		assertFalse(test, "checkIfPrime15");
	}

	@Test
	void testCheckIfPrime7() {
		boolean test = LocatePrimes.checkIfPrime(7);
		assertTrue(test, "checkIfPrime7");
	}
	
	@Test
	void testCheckIfPrime11() {
		boolean test = LocatePrimes.checkIfPrime(11);
		assertTrue(test, "checkIfPrime11");
	}
	
	@Test
	void testCheckIfPrime13() {
		boolean test = LocatePrimes.checkIfPrime(13);
		assertTrue(test, "checkIfPrime13");
	}
	
	@Test
	void testCheckIfPrime47() {
		boolean test = LocatePrimes.checkIfPrime(47);
		assertTrue(test, "checkIfPrime47");
	}
	
	@Test
	void testCheckIfPrime881() {
		boolean test = LocatePrimes.checkIfPrime(881);
		assertTrue(test, "checkIfPrime881");
	}
}

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import HomeWork.Solutions;

class SolutionsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void fibonacci() {
		int expectedResult = 0;
		Solutions solve = new Solutions();
		int actualResult = solve.fibonacci(0);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void fibonacci2() {
		int expectedResult = 21;
		Solutions solve = new Solutions();
		int actualResult = solve.fibonacci(8);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void fibonacci3() {
		int expectedResult = 987;
		Solutions solve = new Solutions();
		int actualResult = solve.fibonacci(16);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void fibonacci4() {
		int expectedResult = 39088169;
		Solutions solve = new Solutions();
		int actualResult = solve.fibonacci(38);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void LongestSameString() {
		String expectedResult = "significant";
		Solutions solve = new Solutions();
		String[] strs = { "significant" };
		String actualResult = solve.LongestSameString(strs);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void LongestSameString2() {
		String expectedResult = "";
		Solutions solve = new Solutions();
		String[] strs = { "function", "future", "cancel", "hihi" };
		String actualResult = solve.LongestSameString(strs);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void LongestSameString3() {
		String expectedResult = "acco";
		Solutions solve = new Solutions();
		String[] strs = { "accompany", "accomplish", "according", "account" };
		String actualResult = solve.LongestSameString(strs);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void LongestSameString4() {
		String expectedResult = "arrangement";
		Solutions solve = new Solutions();
		String[] strs = { "arrangement", "arrangement", "arrangement", "arrangement" };
		String actualResult = solve.LongestSameString(strs);
		assertEquals(expectedResult, actualResult);
	}

}

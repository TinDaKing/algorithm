package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import solutions.Solutions;

class SolutionsTest {

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void romanNumber() {
        int expectedResult = 987;
        Solutions solve = new Solutions();
        int actualResult = solve.romanNumber("CMLXXXVII");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void LongestSameString() {
        String expectedResult = "sig";
        Solutions solve = new Solutions();
        String[] strs = { "significant", "signal", "sigma", "signature" };
        String actualResult = solve.LongestSameString(strs);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sortAlgorithm() {
        int[] expectedResult = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 };
        Solutions solve = new Solutions();
        int[] input = { 2, 1, 1, 2, 0, 2, 0, 1, 0, 2, 0, 0, 1, 2, 1, 0, 0 };
        int[] actualResult = solve.sortAlgorithm(input);
        assertArrayEquals(expectedResult, actualResult);
    }

}

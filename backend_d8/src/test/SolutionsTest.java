package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
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
        int expectedResult = 1000;
        Solutions solve = new Solutions();
        int actualResult = solve.romanNumber("M");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber2() {
        int expectedResult = 56;
        Solutions solve = new Solutions();
        int actualResult = solve.romanNumber("LVI");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber3() {
        int expectedResult = 874;
        Solutions solve = new Solutions();
        int actualResult = solve.romanNumber("DCCCLXXIV");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber4() {
        int expectedResult = 987;
        Solutions solve = new Solutions();
        int actualResult = solve.romanNumber("CMLXXXVII");
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

    @Test
    public void sortAlgorithm() {
        int[] expectedResult = { 0 };
        Solutions solve = new Solutions();
        int[] input = { 0 };
        int[] actualResult = solve.sortAlgorithm(input);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortAlgorithm2() {
        int[] expectedResult = { 0, 0, 1 };
        Solutions solve = new Solutions();
        int[] input = { 0, 0, 1 };
        int[] actualResult = solve.sortAlgorithm(input);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortAlgorithm3() {
        int[] expectedResult = { 0, 0, 0, 1, 1, 1, 2, 2 };
        Solutions solve = new Solutions();
        int[] input = { 2, 1, 0, 2, 0, 0, 1, 1 };
        int[] actualResult = solve.sortAlgorithm(input);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortAlgorithm4() {
        int[] expectedResult = { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 };
        Solutions solve = new Solutions();
        int[] input = { 2, 1, 1, 2, 0, 2, 0, 1, 0, 2, 0, 0, 1, 2, 1, 0, 0 };
        int[] actualResult = solve.sortAlgorithm(input);
        assertArrayEquals(expectedResult, actualResult);
    }

}

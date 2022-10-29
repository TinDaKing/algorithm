package backend_d8;

import solutions.*;

public class Mainday8 {

	public static void main(String[] args) {

		Solutions solve = new Solutions();

		// task 1
		System.out.println(solve.sqrtFunc(2777)); 
		
		// task 2
		System.out.println(solve.romanNumber("CMLXXXVII"));
		
		// task 3
		String[] strs = { "flower", "flow", "florida", "flight" };
		System.out.println(solve.LongestSameString(strs));
		
		// task 4
		int[] arr = { 2, 1, 1, 2, 0, 2, 0, 1, 0, 2, 0, 0, 1, 2, 1, 0, 0 };
		int[] sortedArr = solve.sortAlgorithm(arr);
		solve.printArray(sortedArr);
	}

}

package backend_d9;

import OnClassBinarySearch.*;
import HomeWork.*;

public class Mainday9 {

	public static void main(String[] args) {
		Solutions solve = new Solutions();

		// task 1
		int n = 45;
		System.out.println("Fibonacci of " + n + " is: " + solve.fibonacci(45));
		System.out.println("Fibonacci use Recursion of " + n + " is: " + solve.fibonacciRecursion(45, 0, 1));

		// task 2
		String[] strs = { "flower", "flow", "florida", "flight" };
		System.out.println("Longest same string is: " + solve.LongestSameString(strs));
	}

}

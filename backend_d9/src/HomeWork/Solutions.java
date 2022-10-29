package HomeWork;

public class Solutions {
	public Solutions() {

	}

	public int fibonacci(int n) { // time complex O(n)
		if (n == 0)
			return 0;

		int fi1 = 0; // n = 0
		int fi2 = 1; // n = 1
		int fiN = 1; // n = 2

		for (int i = 2; i <= n; i++) {
			fi2 = fi1;
			fi1 = fiN;
			fiN = fi1 + fi2;
		}
		return fiN;
	}

	public int fibonacciRecursion(int n, int a, int b) { // time complex O(n); a, b is fibo(0) and fibo(1)
		if (n == 0)
			return a;
		return fibonacciRecursion(n - 1, b, a + b);
	}

	public String LongestSameString(String[] strs) { // time complexity O(n*m), m is length of strs[0]

		int max = strs[0].length();
		int count = 0;

		for (int i = 1; i < strs.length; i++) {
			count = 0;
			while (count < strs[i].length() && count < max && strs[i].charAt(count) == strs[0].charAt(count)) {
				++count;
			}
			max = count;
		}

		return strs[0].substring(0, max);
	}

}

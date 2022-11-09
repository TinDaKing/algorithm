package backend_d12;

import java.util.Arrays;
import java.util.List;

public class Mainday12 {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(7, 1, 3, 4, 1, 7);
		System.out.println("Minimum gap of array: " + minimumGap(arr));
		System.out.println("Total bars after the feast: " + theFeast(15, 3, 2));
	}

	public static int minimumGap(List<Integer> arr) { // time complex O(n)
		int minGap = arr.size();
		int max = arr.get(0);
		for (Integer i : arr) { // find max element to create hashTable size = max, cost O(n)
			if (i > max)
				max = i;
		}
		Integer[] hashTable = new Integer[max + 1];
		for (int i = 0; i < arr.size(); i++) {
			Integer cur = arr.get(i);
			if (hashTable[cur] == null) {
				hashTable[cur] = i;
			} else if ((i - hashTable[cur]) < minGap) {
				minGap = i - hashTable[cur];
				hashTable[cur] = i;
			} else {
				hashTable[cur] = i;
			}
		}
		return minGap;
	}

	public static int theFeast(int n, int c, int m) { // time complex O(n)
		int barLeft = n / c;
		int totalBar = n / c;
		int bonus = 0, redundant = 0;
		while (barLeft >= m) {
			redundant = barLeft % m;
			bonus = barLeft / m;
			barLeft = bonus + redundant;
			totalBar += bonus;
		}
		return totalBar;
	}
}

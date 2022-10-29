package solutions;

public class Solutions {

    public Solutions() {
        // TODO Auto-generated constructor stub
    }

    // task 1
    public double sqrtFunc(double n) { // time complexity O(log2(n))
        double result = n / 2;
        double temp = 0;
        while (result != temp) {
            temp = result;
            result = (n / temp + temp) / 2;
        }
        return (double) Math.round(result * 100) / 100;
    }

    // task 2
    public int romanNumber(String n) { // time complex is O(n)
        int result = 0;
        int lastNumber = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int a = singleBasicRomanNumber(n.charAt(i));
            if (a < lastNumber) {
                result = result - a;
            } else {
                result = result + a;
                lastNumber = a;
            }
        }
        return result;
    }

    private int singleBasicRomanNumber(char n) {
        switch (n) {
            case 'I': {
                return 1;
            }
            case 'V': {
                return 5;
            }
            case 'X': {
                return 10;
            }
            case 'L': {
                return 50;
            }
            case 'C': {
                return 100;
            }
            case 'D': {
                return 500;
            }
            case 'M': {
                return 1000;
            }
        }
        throw new ArithmeticException("Input not valid!??");
    }

    // task 3
    public String LongestSameString(String[] strs) { // time complexity O(n*m), m is length of strs[0]

        int max = strs[0].length();
        int count = 0;

        for (int i = 1; i < strs.length; i++) {
            count = 0;
            while (count < strs[i].length() && count < max &&
                    strs[i].charAt(count) == strs[0].charAt(count)) {
                ++count;
            }
            max = count;
        }

        return strs[0].substring(0, max);
    }

    // task 4
    public int[] sortAlgorithm(int[] arr) { // time complex O(n), space complex O(n)
        int[] sortedArr = new int[arr.length];
        int low = 0, high = arr.length - 1;
        int midlow = low;

        for (int element : arr) {
            if (element == 2) { // case = 2
                sortedArr[high] = element;
                --high;

            } else if (element == 1) { // case = 1
                sortedArr[midlow] = element;
                ++midlow;

            } else { // case = 0
                sortedArr[midlow] = 1;
                sortedArr[low] = 0;
                ++midlow;
                ++low;
            }
        }
        return sortedArr;
    }

    public void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

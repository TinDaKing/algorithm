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
//        if (!isValidRomanNumber(n))
//            return -1;

        int finalRNum = 0;
        for (int i = 0; i < n.length(); i++) {
            int cur = singleBasicRomanNumber(n.charAt(i));
            int nex = singleBasicRomanNumber(n.charAt(i + 1));

            if (cur < nex) {
                finalRNum += (nex - cur);
                ++i;
            } else if (i == n.length() - 2) {
                finalRNum += (nex + cur);
                break;
            } else {
                finalRNum += cur;
            }
        }
        return finalRNum;
    }

//    private boolean isValidRomanNumber(String n) {
//        for (int i = 0; i < n.length(); i++) {
//            if (n.charAt(i) != 'I' && n.charAt(i) != 'V' && n.charAt(i) != 'X' && n.charAt(i) != 'L'
//                    && n.charAt(i) != 'C' && n.charAt(i) != 'D' && n.charAt(i) != 'M') {
//                System.out.println("Input for roman number contains invalid character.");
//                throw new ArithmeticException("Input not valid!??");
//            }
//        }
//        return true;
//    }

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
    public String LongestSameString(String[] strs) { // time complexity O(xn) , x equal to length of the first string
        String result = "";
        char temp = strs[0].charAt(0);
        int cur = 0;

        while (cur < strs[0].length()) {
            temp = strs[0].charAt(cur);

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(cur) != temp) {
                    return result;
                }
            }
            result += temp;
            ++cur;
        }

        return result;
    }

    // task 4
    public int[] sortAlgorithm(int[] arr) { // time complex O(n)
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
            } else if (low != midlow) { // case = 0
                sortedArr[low] = 0;
                sortedArr[midlow] = 1;
                ++low;
                ++midlow;
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

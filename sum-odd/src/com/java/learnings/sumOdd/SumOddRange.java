package com.java.learnings.sumOdd;

public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > end || start <0 ||end <0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            if (isOdd(index)) {
                sum += index;
            }
        }
        return sum;
    }


}

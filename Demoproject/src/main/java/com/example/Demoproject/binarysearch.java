package com.example.Demoproject;

import java.util.Arrays;

public class binarysearch {
    public static void main(String args[]) {

        int[] ints = {1, 3, 5, 6, 9, 12, 14, 16};
        System.out.println(Arrays.binarySearch(ints, 12));

    }

    private static int binarySearch(int[] num, int foundnum) {
        int low = 0;
        int high = num.length - 1;

        while (low <= high) {
            int middleindex = (low + high) / 2;
            int middlenum = num[middleindex];

            if (foundnum == middlenum) {
                return middleindex;
            }
            if (foundnum < middlenum) {
                high = middleindex - 1;
            } else {
                low = middleindex + 1;
            }
        }
        return -1;
    }
}

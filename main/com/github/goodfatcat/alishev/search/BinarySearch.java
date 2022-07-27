package com.github.goodfatcat.alishev.search;

import com.github.goodfatcat.sort.ArraysTool;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] array = ArraysTool.createRandomArray();
        int[] array = {1, 4, 2, 56, 8, 454, 34546, 1, 20, 45, 12, 20};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int res = binarySearch(20, array);

        System.out.println(res);
    }
    // it can remake like method binarySearch
    public static int search(int searching, int[] array) {
        if (searching == array[array.length / 2]) {
            return array.length / 2;
        } else if (searching > array[array.length / 2]) {
            int[] tmp = Arrays.copyOfRange(array, array.length / 2, array.length);
            if (tmp.length > 1)
                search(searching, tmp);
        } else {
            int[] tmp = Arrays.copyOfRange(array, 0, array.length / 2);
            if (tmp.length > 1)
                search(searching, tmp);
        }
        return -1;
    }

    // from Alishev
    public static int binarySearch(int searching, int[] array) {
        int low = 0;
        int high = array.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (searching < array[mid]) {
                high = mid - 1;
            } else if (searching > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

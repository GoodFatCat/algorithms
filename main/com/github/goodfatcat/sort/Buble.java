package main.com.github.goodfatcat.sort;

import java.util.Arrays;

public class Buble {
    public static void main(String[] args) {
        int[] array = ArraysTool.createRandomArray();

        System.out.println("Before");

        System.out.println(Arrays.toString(array));

        sort(array);

        System.out.println("After");

        System.out.println(Arrays.toString(array));
    }
    
    public static void sort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    int tmp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
    }
}

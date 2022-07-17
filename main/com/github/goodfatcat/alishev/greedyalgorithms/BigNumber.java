package main.com.github.goodfatcat.alishev.greedyalgorithms;

import java.util.Arrays;
import java.util.Random;

// Создается случайный массив со значениями от 0 до 9 необходимо создать максимальное значение.
public class BigNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("Before");

        System.out.println(Arrays.toString(array));
        int[] res = new int[10];
        int m = 0;

        for (int i = 9; i > -1; i--) {
            for (int k : array) {
                if (k == i) {
                    res[m] = k;
                    m++;
                }
            }
        }

        System.out.println("After");

        System.out.println(Arrays.toString(res));
    }
}

package main.com.github.goodfatcat.fibonachi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(getNumberFibonacciEffectively(n));

    }

    // Ineffective
    private static long getNumberFibonacci(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;

        return getNumberFibonacci(n - 1) + getNumberFibonacci(n - 2);

    }

    private static long getNumberFibonacciEffectively(int n) {

        long[] list = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                list[i] = i;
            } else {
                list[i] = list[i - 1] + list[i - 2];
            }
        }

        return list[n];
    }
}

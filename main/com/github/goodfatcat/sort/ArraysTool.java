package main.com.github.goodfatcat.sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class ArraysTool {
    public static int[] createRandomArray() {
        Random random = new Random(new Date().getTime());

        int[] array = new int[random.nextInt(20)];

        array = Arrays.stream(array).map(x -> x = random.nextInt(200) - 100).toArray();

        return array;
    }

    public static void main(String[] args) {
        createRandomArray();
    }
}

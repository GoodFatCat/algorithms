package main.com.github.goodfatcat.sort;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int[] array = ArraysTool.createRandomArray();
		
		System.out.println(Arrays.toString(array));
		
		sort(array);
		
		System.out.println(Arrays.toString(array));
	}
	
	public static void sort(int[] array) {
		Bubble.sort(array);
	}
}

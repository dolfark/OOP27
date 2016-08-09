package lesson3;

import java.util.Arrays;

public class Task0 {
	public static void main(String[] args) {

		int[] array = { 9, 8, 7, 6, 5, 4 };
		bubbleSort(array);
		System.out.println(Arrays.toString(array));

	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}

		}
	}

}

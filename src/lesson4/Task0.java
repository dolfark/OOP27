package lesson4;

import java.util.Arrays;

public class Task0 {

	public static void main(String[] args) {

		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int[] array) {
		for (int j = 0; j < array.length - 1; j++) {
			int indexMin = j;
			for (int i = j + 1; i < array.length; i++) {

				if (array[i] < array[indexMin]) {
					indexMin = i;
				}

			}
			swap(array, j, indexMin);
			// int tmp = array[j];
			// array[j] = array[indexMin];
			// array[indexMin] = tmp;
		}
	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;

	}

}

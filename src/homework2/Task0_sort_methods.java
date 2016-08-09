package homework2;

import java.util.Arrays;

public class Task0_sort_methods {
	public static void main(String[] args) {

		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr));
		System.out.println("--------------------------");
		// stupidSort(arr);
		// bubleSort(arr);
		// shakerSort(arr);
		// chet_nechetSort(arr);
		// comboSort(arr);
		// selectionSort(arr);
		insertSort(arr);
		System.out.println("--------------------------");
		System.out.println(Arrays.toString(arr));

	}

	public static void stupidSort(int[] arr) {
		boolean check = true;
		while (check) {
			// int i = 0;
			check = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					i = 0;
					check = true;
				}

			}

		}

	}

	public static void bubleSort(int[] arr) {
		boolean check = true;
		for (int i = 0; i < arr.length && check == true; i++) {
			check = false;
			System.out.println(Arrays.toString(arr));
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					check = true;
				}
			}
		}

	}

	public static void shakerSort(int[] arr) {
		boolean check = true;
		for (int i = 0; i < arr.length && check == true; i++) {
			check = false;
			System.out.println(Arrays.toString(arr));

			for (int j = i; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					check = true;
				}
			}

			for (int w = arr.length - 1 - i; w > i; w--) {
				if (arr[w] < arr[w - 1]) {
					swap(arr, w, w - 1);
					check = true;
				}
			}
		}
	}

	public static void shaker(int[] arr) {
		boolean repeat = true;

		int left = 0;
		int right = arr.length;

		while (repeat) {
			repeat = false;
			for (int j = left; j < right - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int buff = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = buff;
					repeat = true;
				}
			}
			right--;
			for (int k = right; k > left; k--) {
				if (arr[k] < arr[k - 1]) {
					int buff = arr[k - 1];
					arr[k - 1] = arr[k];
					arr[k] = buff;
					repeat = true;
				}
			}
			left++;
		}
	}

	public static void chet_nechetSort(int[] arr) {
		boolean check = true;
		while (check) {
			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < arr.length - 1; i += 2) {

				check = false;
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
					check = true;
					// System.out.println("i= " + i + Arrays.toString(arr));
				}

			}

			for (int j = 1; j < arr.length - 1; j += 2) {
				check = false;
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					check = true;
					// System.out.println("j= " + j + Arrays.toString(arr));
				}
			}
		}

	}

	public static void comboSort(int[] arr) {
		boolean check = true;
		for (int j = arr.length - 1 - 1; j > 0; j--) {
			for (int i = 0; i + j < arr.length; i++) {
				if (arr[i] > arr[j + i]) {
					swap(arr, i, j + i);
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void selectionSort(int[] arr) {
		boolean check = true;
		for (int j = 0; j < arr.length - 1 && check == true; j++) {
			check = false;
			int indexMin = j;

			for (int i = j + 1; i < arr.length; i++) {

				if (arr[i] < arr[indexMin]) {
					indexMin = i;
					check = true;
				}

			}
			swap(arr, j, indexMin);
			System.out.println(Arrays.toString(arr));

		}

	}

	public static void insertion(int[] array) {

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
				swap(array, j - 1, j);
			}
		}
	}

	public static void insertSort(int[] arr) {
		boolean check = true;
		for (int i = 0; i < arr.length - 1 && check == true; i++) {
			check = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					swap(arr, i, j);
					for (int w = i; w != 0; w--) {
						if (arr[w] < arr[w - 1]) {
							swap(arr, w, w - 1);
							check = true;
						}

					}
					check = true;
				}
			}
			System.out.println(Arrays.toString(arr));
		}

	}
	
	public static void shellSort(int[] array) {
		int step = array.length / 2;
		while (step > 0) {
			for (int i = 0; i < (array.length - step); i++) {
				int j = i;
				while (j >= 0 && (array[j] > array[j + step])) {
					int temp = array[j];
					array[j] = array[j + step];
					array[j + step] = temp;
					j--;
				}

			}
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	

}

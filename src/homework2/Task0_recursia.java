package homework2;

import java.util.Arrays;

//0. int sum(int val) - Метод возвращает сумму всех цифр числа
//Пример :  int res = sum(1234); // res = 10

public class Task0_recursia {
	public static void main(String[] args) {
		// System.out.println(sum(12345));
		// System.out.println(pov(10, 3));
		// System.out.println(factorial(5));
		revers(12345);
	}

	public static int sum(int n) {

		return n == 0 ? 0 : sum(n / 10) + (n % 10);

		// if (n / 10 != 0)
		// return n % 10 + sum(n / 10);
		// else
		// return n % 10;
	}

	// 2. Написать метод pow() с входными аргументами int n, int m. Метод берет
	// число n и возводит его в степень m. Сделать так же рекурсивно.
	// возведение в степень pow (n,m) решение n^m = n*n^m-1
	public static int pov(int n, int m) {
		if (m == 0) {
			return 1;
		} else {
			int res = n * pov(n, m - 1);
			return res;
		}

	}

	public static int powV2(int num, int pov) {
		// тернарное выражение
		return pov == 0 ? 1 : num * powV2(num, pov - 1);
		// if (pov==0) return 1; else return num*powV2(num,pov-1);

	}

	// 1.Написать метод factorial() с входным аргументом типа int, который
	// возвращает его факториал. Сделать рекурсивно.
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			int res = n * factorial(n - 1);
			return res;
		}
	}

	// 1. void revers(int val) - Метод выводит в консоль число наоборот
	// Пример : revers(1234); // в консоли 4321
	public static void revers(int val) {
		if (val != 0) {
			System.out.print(val % 10);
			revers(val / 10);
		} else {
			return;
		}

	}

	public static int revV2(int n) {
		return Integer.parseInt(new StringBuilder().append(n).reverse().toString());
	}

	// 2. int fib(int val) - метод возвращает значение по порядковому номеру из
	// ряда Фибоначчи.
	// Пример : int res = fib(7) // res = 13;

	// public static int fib (int val){
	// if (val)
	// res = fib(val-1)+
	// }

	public static void permute(int[] arr, int idx) {

		if (idx == arr.length - 1) {
			System.out.println(Arrays.toString(arr));
			return;
		}

		for (int i = idx; i < arr.length; i++) {

			swap(arr, idx, i);
			permute(arr, idx + 1);
			swap(arr, idx, i);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

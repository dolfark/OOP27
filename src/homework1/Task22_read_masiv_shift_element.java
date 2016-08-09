package homework1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

//2. Читаем двумерный массив из файла, 
// сдвигаем все элементы на n элементов веперд или назад, 
//направление зависит от знака n. n вводим с клавиатуры. 
//в другой файл записываем результат. 
public class Task22_read_masiv_shift_element {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("c:/tmp/test.txt");
		FileWriter writer = new FileWriter("c:/tmp/test1.txt");
		Scanner inConsole = new Scanner(System.in);
		System.out.println("Enter number for move arrays Element");
		int moveTo = inConsole.nextInt();
		Scanner in = new Scanner(reader);

		int listArray[][] = readArray(reader, in);
		
		printArray(listArray);
		moveElementArray(listArray, moveTo);
		writeToFile(listArray, writer);
		System.out.println("----------------");
		printArray(listArray);

	}

	public static int [][] readArray(FileReader reader, Scanner in) throws IOException {
		
		int n = 5;
		int m = 5;

		
		int [][] listArray = new int [n][m];
		n = listArray.length;
		for (int i = 0; i < n; i++) {
			m = listArray[i].length;
			for (int j = 0; j < m && in.hasNext(); j++) {
				listArray[i][j] = in.nextInt();
			}
		}
		return listArray;
	}

	public static void printArray(int[][] listArray) {
		for (int i = 0; i < listArray.length; i++) {
			for (int j = 0; j < listArray[i].length; j++) {
				System.out.print(listArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void writeToFile(int[][] listArray, FileWriter writer) throws IOException {
		for (int i = 0; i < listArray.length; i++) {
			for (int j = 0; j < listArray[i].length; j++) {
				writer.write(listArray[i][j] + " ");
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
	}

	public static void moveElementArray(int[][] listArray, int moveTo) {
		int size = listArray.length;

		for (int i = 0; i < listArray.length; i++) {

			for (int n = 0; n < moveTo; n++) {
				int temp = listArray[i][size - 1];
				for (int j = listArray[i].length - 1; j > 0; j--) {
					listArray[i][j] = listArray[i][j - 1];
				}
				listArray[i][0] = temp;
			}

		}
	}
}

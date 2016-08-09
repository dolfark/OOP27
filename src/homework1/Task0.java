package homework1;
// 0. „итаем строку из файла - пишем в другой файл только символы
// верхнего регистра, которые встречаютс¤ в файле. 
import java.io.*;
import java.util.Scanner;

public class Task0 {
	public static void main(String[] args) throws IOException {
		FileReader fileRead = new FileReader("c:\\tmp\\test1.txt");
		FileWriter fileWrite = new FileWriter("c:\\tmp\\test2.txt");
		Scanner sc = new Scanner(fileRead);
		String str = sc.nextLine();
		String str1 = "";
		System.out.println(str);
		upperCase(fileRead, sc, str, str1, fileWrite);
	}
 
	public static void upperCase(FileReader fileRead, Scanner sc, String str,
			String str1, FileWriter fileWrite) throws IOException {
		for (int i = 0; i < str.length(); i++) {
			char symbol = str.charAt(i);
			if (Character.isUpperCase(symbol)) {
				str1 += symbol;
			}
		}
		fileWrite.write(str1);
		fileWrite.flush();
	}

}

//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class Task {
// public static void main(String[] args) throws IOException {
//
//  PrintWriter writer = new PrintWriter("/home/stefan/tmp/result.txt");
//  
//  FileReader reader = new FileReader("/home/stefan/tmp/text.txt");
//  
//  Scanner scan = new Scanner(reader);
//  while (scan.hasNextLine()) {
////   String resultString = "";
//   String textLine = scan.nextLine();
////   System.out.println(textLine);
//   
//   for (int i = 0; i < textLine.length(); i++) {
//    char symbol = textLine.charAt(i);
//    if (Character.isUpperCase(symbol)) {
//     writer.print(symbol);
////     resultString += symbol;
////     System.out.println(resultString);
//    }
//   }
//   writer.println();
//
//  }
//  reader.close();
//  writer.flush();
//  writer.close();
// }
//
//}

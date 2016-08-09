package homework1;

import java.io.*;
import java.util.Scanner;

public class Task0_read_file_write_uppercase_sympols {
	// 0. „итаем строку из файла - пишем в другой файл только символы
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("c:/tmp/test.txt");
		FileWriter writer = new FileWriter("c:/tmp/test1.txt");
		// верхнего регистра, которые встречаютс¤ в файле.
		Scanner in = new Scanner(reader);
		
		String readResBegin = "";
		while (in.hasNextLine()){
			String readRes = in.nextLine();			
			
			upperCase(readRes,readResBegin,reader,writer,in);	
			writer.write("\n");
		}
		
	}

	public static void upperCase(String readRes, String readResBegin, FileReader reader, FileWriter writer, Scanner in) throws IOException{
		for (int i=0; i<readRes.length(); i++){
			char symbolRes = readRes.charAt(i);
			if (Character.isUpperCase(symbolRes)){
				readResBegin+=symbolRes;
			}
		}
		writer.write(readResBegin);
		writer.flush();
	}
}

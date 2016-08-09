package homework1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//4. ѕишем программу, котора¤ заменит все "нецензурные слова" в файле на 
//[вырезано цензурой], пишем в тот же файл результат. 
//"нецензурные слова" программа считывает из другого файла. 
public class Task4_replace_bad_words {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:/tmp/test.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("c:/tmp/test1.txt"));

		String file;
		String file1;

		ArrayList<String[]> fileAr = new ArrayList<String[]>();
		while ((file = br.readLine()) != null) {
			fileAr.add(file.split("[\\s,.]+"));
		}
		br.close();

		ArrayList<String> badWord = new ArrayList<String>();
		while ((file1 = br1.readLine()) != null) {
			badWord.add(file1);
		}
		br1.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("c:/tmp/test2.txt"));

		String x = "[вырезано цензурой]";

		for (String[] arr : fileAr) {
			for (String str : arr) {
				
				for (String chek : badWord) {
					if (str.equalsIgnoreCase(chek)) {
						bw.write(x);
					} else {
						bw.write(str);
					}
					bw.write(" ");
				}
			}
			bw.write("\r\n");
		}

	}

}

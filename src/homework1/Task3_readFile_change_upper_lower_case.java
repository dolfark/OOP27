package homework1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3_readFile_change_upper_lower_case {
	// 3. Читаем строку из файла, записываем в другой файл ту же строку заменив
	// все символы нижнего регистра - символами верхнего, и наоборот.
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("c:/tmp/test.txt");
		FileWriter writer = new FileWriter("c:/tmp/test1.txt");
		Scanner in = new Scanner(reader);
		String str = "";
		while (in.hasNextLine()) {
			String result = "";
			str = in.nextLine();
			for (int i = 0; i < str.length(); i++) {
				char tmp = str.charAt(i);
				if (Character.isUpperCase(tmp)) {
					result += Character.toLowerCase(tmp);
				} else {
					result += Character.toUpperCase(tmp);
				}

			}
			writer.write(result);
			writer.write("\n");
			writer.flush();

		}
		writer.close();

	}

}

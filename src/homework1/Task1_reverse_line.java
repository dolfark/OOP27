package homework1;

import java.io.*;
import java.util.*;

public class Task1_reverse_line {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("c:/tmp/test.txt");
		FileWriter writer = new FileWriter("c:/tmp/test1.txt");
		Scanner in = new Scanner(reader);
		String resString = "";
		while (in.hasNextLine()) {
			String line = in.nextLine();
			reverseLine(reader, writer, in, line, resString);
			
		}
	}

	public static void reverseLine(FileReader reader, FileWriter writer, Scanner in, String line, String resString)
			throws IOException {
		for (int i = 0; i < line.length(); i++) {
			char symbol = line.charAt(line.length()-1-i);
			resString += symbol;
		}
		writer.write(resString);
		writer.write("\n");
		writer.flush();
	}

}

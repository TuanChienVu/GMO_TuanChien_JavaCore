package printWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static final String TEST_FILE = "C:\\Test.txt";

	public static void main(String[] args) {

		String studentName = "Tuan Chien Vu";
		String studentClass = "03DHTH2";
		int studentAge = 24;
		BufferedReader input = null;
		try {
			// Write my information into Test_File
			FileOutputStream fileOutputStream = new FileOutputStream(TEST_FILE, true);
			PrintWriter pw = new PrintWriter(fileOutputStream);
			pw.println(studentName);
			pw.println(studentClass);
			pw.println(studentAge);
			pw.close();

			// Read from Test_File and print out
			FileReader fileReader = new FileReader(TEST_FILE);
			input = new BufferedReader(fileReader);
			System.out.println(input.readLine());
			System.out.println(input.readLine());
			System.out.println(input.readLine());

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

package fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static final String INPUT_FILE = "C:\\fileInputStreamExample.txt";
	
	public static void main(String[] args) throws IOException {

		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(INPUT_FILE);
			System.out.println("Available: " + fileInputStream.available());
			
//			Read a single byte
			int result = fileInputStream.read();
			System.out.println("Read byte: " + result);
			
			int content;
			while ((content = fileInputStream.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e1) {
			System.out.println("Error when read file");
		} finally {
//			close file
			if (fileInputStream != null) {
				fileInputStream.close();
			}
		}
	}

}

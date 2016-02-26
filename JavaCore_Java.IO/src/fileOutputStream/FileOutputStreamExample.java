package fileOutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static final String OUTPUT_FILE = "C:\\fileOutputStreamExample.txt";
	
	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_FILE);
			String content = "Example of Java FileOutputStream Class";
			
//			converting string into byte array
			byte[] bytes = content.getBytes();
			fileOutputStream.write(bytes);
			fileOutputStream.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println("Can not write");
		}
	}

}

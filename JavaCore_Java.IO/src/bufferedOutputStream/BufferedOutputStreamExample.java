package bufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static final String OUTPUT_FILE = "C:\\BufferedOutputStream.txt";
	
	public static void main(String[] args) {
		
		BufferedOutputStream bufferedOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
//			Create FileOutputStream from BufferedOutputStream.txt
			fileOutputStream = new FileOutputStream(OUTPUT_FILE);
			
//			Create BufferedOutputStream for FileOutputStream
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			
			String contents = "This is my Buffered Output Stream Example";
			bufferedOutputStream.write(contents.getBytes());
			System.out.println("Success");
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException ioException) {
			System.out.println("Error when writing file");
		} finally {
			if (bufferedOutputStream != null) {
				try {
					bufferedOutputStream.flush();
					bufferedOutputStream.close();
				} catch (Exception e) {
					System.out.println("Error when closing streams");
				}
			}
		}
		
	}

}

package bufferedInputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static final String INPUT_FILE = "C:\\BufferedInputStream.txt";

	public static void main(String[] args) {
		
		File file = new File(INPUT_FILE);
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			bufferedInputStream = new BufferedInputStream(fileInputStream);

			// process each character at a time
			while (bufferedInputStream.available() > 0) {
				System.out.print((char) bufferedInputStream.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
				bufferedInputStream.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

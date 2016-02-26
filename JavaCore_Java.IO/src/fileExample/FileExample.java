package fileExample;

import java.io.File;
import java.io.FileOutputStream;

public class FileExample {

	private static final String OUTPUT_FILE = "C:\\Users\\Public\\FilePath.txt";
	private static final String DIR_PATH = "C:\\Users\\Public\\TuanChien";

	public static void main(String[] args) {

		File newDir = new File(DIR_PATH);

		// Check for the file's existence
		boolean dirExist = newDir.exists();
		if (dirExist) {
			System.out.println("Tuan Chien Directory exists");
		} else {
			// Create a new directory
			newDir.mkdir();
			System.out.println("Success to create Tuan Chien Directory");
		}

		// Create a File object
		File file = new File(OUTPUT_FILE);
		String contents = "How to use File in Java";
		byte[] bytes = contents.getBytes();
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(OUTPUT_FILE);

			// write whole text by using byte
			fileOutputStream.write(bytes);
			System.out.println("Success to create a file");

		} catch (Exception e) {
			System.out.println("Can not write file");
		}

		// how to get the absolute file path
		String absoluteFilePath = file.getAbsolutePath();
		System.out.println("Absolute File Path: " + absoluteFilePath);

		// how to get the path of the parent directory of file
		String parentPath = absoluteFilePath.substring(0, absoluteFilePath.lastIndexOf(File.separator));
		System.out.println("Parent File Path: " + parentPath);

	}

}

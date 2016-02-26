package stringBufferExample;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer();
		
//		Append the string representation of the argument to the end of the buffer.
		stringBuffer.append("Happy New Year!...");
		System.out.println(stringBuffer.toString());
		
//		Delete the specified substring by providing 
//		the start and the end of the sequence.
		stringBuffer.delete(15, 18);
		System.out.println(stringBuffer.toString());
		
//		Delete just one char by providing its position.
		stringBuffer.deleteCharAt(14);
		System.out.println(stringBuffer.toString());
		
//		Insert a string in a specified place inside the buffer.
		stringBuffer.insert(14, " 2016");
		System.out.println(stringBuffer.toString());
	}

}

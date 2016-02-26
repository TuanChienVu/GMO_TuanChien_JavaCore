package stringBuilderExample;

public class StringBuilderClass {
	
	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("I am Tuan Chien");
		System.out.println("StringBuilder just appends a String: " + stringBuilder);
		
//		Append a character
		char charInText = '!';
		stringBuilder.append(charInText);
		System.out.println("StringBuilder continues to add a char: " + stringBuilder);
		
//		Insert my family name
		stringBuilder.insert(4, " Vu");
		System.out.println("StringBuilder after inserting: " + stringBuilder);
		
//		StringBulder with a initialized capacity
		StringBuilder secondStringBuilder = new StringBuilder();
		secondStringBuilder.append(123456789);
		System.out.println("StringBuilder with length: " 
		+ secondStringBuilder.length() 
		+ " and capacity: " + secondStringBuilder.capacity() 
		+ " appends an int: " + secondStringBuilder);
		
//		Delete 456
		secondStringBuilder.delete(3, 6);
		System.out.println("StringBuilder after deleting: " + secondStringBuilder);
		
		
	}

}

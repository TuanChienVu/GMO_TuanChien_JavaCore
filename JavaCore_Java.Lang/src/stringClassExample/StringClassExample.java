package stringClassExample;

public class StringClassExample {

	public static void main(String[] args) {

		String a = "You will see output";
		String b = "You will see output";
		
//		It is important to use equals for string comparison.
		if (a.equals(b)) {
			System.out.println("a and b are equal");
		} else {
			System.out.println("Not equal");
		}
		
//		Should never use ‘==’ to compare any two Objects
		String c = new String("You will see output");
		if (a == c) {
			System.out.println("a and c are equal");
		} else {
			System.out.println("a and c are NOT equal\n");
		}
		
//		Case sensitive comparison
		String upString = "MY LAPTOP IS LENOVO";
		String lowString = "my laptop is lenovo";
		
		if (upString.equals(lowString)) {
			System.out.println("UpString and LowString are equal");
		} else {
			System.out.println("UpString and LowString are NOT equal by using equal");
		}
		
//		Using equalsIngoreCase
		if (upString.equalsIgnoreCase(lowString)) {
			System.out.println("UpString and LowString are equal by using equalsIngoreCase");
		} else {
			System.out.println("UpString and LowString are NOT equal");
		}
		
//		Concatenation using + operator
		String firstString = "I am a";
		String secondString = "Dev";
		secondString = firstString + " " + secondString;
		System.out.println("Result: " + secondString);
	}

}

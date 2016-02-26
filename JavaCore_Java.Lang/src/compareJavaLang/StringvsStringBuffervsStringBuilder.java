package compareJavaLang;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {
		
		long startTime;
		String text = "Compare";
		StringBuffer stringBuffer = new StringBuffer();
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(text);
//		Using String
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			text += "JavaLang";
		}
		System.out.println("Time using String: " + (System.currentTimeMillis() - startTime) + "ms.");
		
//		 Using StringBuffer
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			stringBuffer.append("JavaLang");
		}
		System.out.println("Time using StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms.");
		
//		 Using StringBuilder
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			stringBuilder.append("JavaLang");
		}
		System.out.println("Time using StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms.");
	}
	
}

/*
 * 예외 떠넘기기(throws)
 * 예외를 메소드를 호출한 곳으로 지정
 */
package throwsexception;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found...");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		// Class clazz = Class.forName("java.lang.String2");
		Class clazz = Class.forName("java.lang.String");
		if(clazz != null) {
			System.out.println("Class found...");
		}
	}

}

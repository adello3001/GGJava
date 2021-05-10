/*
 * 예외 떠넘기기(throws)
 * 예외를 메소드를 호출한 곳으로 지정
 */
package throwsexception;

public class ThrowsExample2 {

	public static void main(String[] args) {
		findClass();
	}
	
	public static void findClass() {
		try {
			Class clazz = Class.forName("java.lang.String2");
			// Class clazz = Class.forName("java.lang.String");
			System.out.println("Class found...");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class not found...");
		}
	}

}

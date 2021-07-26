package nullpointer;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;  // 할당이 되어 있지 않다.
		System.out.println(data.toString()); // java.lang.NullPointerException
		
		System.out.println("작업끝");

	}

}

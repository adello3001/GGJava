package nullpointer;

public class NullPointerExceptionExample1 {

	public static void main(String[] args) {
		String data = ""; // 비어있음(empty)
		System.out.printf("data.length=[%d]\n", data.length());
		System.out.printf("data.toString=[%s]\n", data.toString());
		
		System.out.println("작업끝");

	}

}

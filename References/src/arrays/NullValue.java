package arrays;
/*
 * null value
 *  - 무효의 값
 *  - 참조타입은 널(null) 값을 가질 수 있다.
 *  - 참조타입이 널이면 변수는 스택에 할당이 되고 힙에는 할당되지 않은 상태
 * 
 */
public class NullValue {

	public static void main(String[] args) {
		String hello = null;
		
		System.out.println("hello=" + hello);
		// System.out.printf("hello(%s), length(%d) \n", hello, hello.length()); // java.lang.NullPointerException

		if(hello == null) {
			// hello = "hello, world";
			hello = new String("hello, world!");
		}
		
		System.out.printf("hello(%s), length(%d) \n", hello, hello.length());
	}

}

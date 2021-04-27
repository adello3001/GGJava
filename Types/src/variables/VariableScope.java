/*
 * 변수의 사용 범위
 */
public class VariableScope {

	public static void main(String[] args) {
		int a1 = 10;
		
		System.out.println("a1=" + a1);
		
		{ // [block1]
			int b1 = 20;
			System.out.println("[block1]");
			System.out.println("a1=" + a1);
			System.out.println("b1=" + b1);
			
			{ // [ block1-1]
				int b1_1 = 30;
				System.out.println("[block1]");
				System.out.println("a1=" + a1);
				System.out.println("b1=" + b1);
				System.out.println("b1_1=" + b1_1);
			}
			
			System.out.println("b1=" + b1);     
			// 외부블럭에서는 내부블럭에서 선언된 변수에 접근할 수 없다.
			// System.out.println("b1_1=" + b1_1);
		}
		
		System.out.println("[main block]");
		System.out.println("a1=" + a1);
		// 외부블럭에서는 내부블럭에서 선언된 변수에 접근할 수 없다.
		// System.out.println("b1=" + b1);     
		// System.out.println("b1_1=" + b1_1);
	}
}

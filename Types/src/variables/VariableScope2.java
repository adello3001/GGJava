/*
 * 변수의 사용 범위
 */
public class VariableScope2 {

	public static void main(String[] args) {
		int a1 = 10;
		
		System.out.println("a1=" + a1);
		
		{ // 블럭내에서 블럭 외부에 선언된 동일한 변수를 선언할 수 없다.
			// int a1 = 20;
			a1 = a1 + 5; // 값을 변경시키면 원래의 변수에 반영된다.
			System.out.println("a1=" + a1);
		}
	}
}

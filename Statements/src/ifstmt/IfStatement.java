package ifstmt;
/*
 * 조건문(if)
 * if(조건식) {
 * }
 * 
 * 조건식의 결과가 참이면 블럭을 수행
 * 조건식의 결과는 boolean 타입
 */
public class IfStatement {

	public static void main(String[] args) {
		if(true) {
			System.out.println("참이다");
		}
		
		int x = 9;
		if(x > 9) {  // 참
			System.out.println("x는 9보다 크다");
		}
		else { // 거짓
			System.out.println("x는 9보다 크지 않다");
		}
	}
}

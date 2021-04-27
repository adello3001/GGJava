package ifstmt;
/*
 * 조건문
 * 난수 : 임의의 수를 발생
 *   0.0 <= Math.random() < 1.0 
 */
public class IfStatement4 {

	public static void main(String[] args) {
		double x1 = Math.random();
		double x2 = Math.random();
		double x3 = Math.random();
		double x4 = Math.random();
		double x5 = Math.random();
		
		System.out.println("random:" + x1);
		System.out.println("random:" + x2);
		System.out.println("random:" + x3);
		System.out.println("random:" + x4);
		System.out.println("random:" + x5);
		
		// 1부터 6까지의 난수를 발생시켜라.
		double x = Math.random();
		int six = (int)(x * 6 + 1);
		System.out.println("random:" + six);
		
		/* 가장 작은 값
		0.06 = 0.01 * 6;
		1.06 = 0.06 + 1;
		1 = (int)1.06;
		*/
		
		/* 가장 큰 값
		5.4 = 0.9 * 6
		6.4 = 5.4 + 1
		6 = (int)6.4;
		*/
		
		
	}
}

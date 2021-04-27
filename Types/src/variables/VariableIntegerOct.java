/*
 * 변수(Variable)
 * 8진수값은 정수값 앞에 0를 붙인다. (0부터 7까지의 값)
 */
public class VariableIntegerOct {

	public static void main(String[] args) {
		int ot = 07;     // 
		int ot10 = 010;  // 8진수(010) -> 10진수(8)
		int ot11 = 011;  // 8진수(011) -> 10진수(9)
		int ot12 = 012;  // 8진수(012) -> 10진수(10)
		int ot13 = 013;  // 8진수(013) -> 10진수(11)
		int ot14 = 014;  // 8진수(014) -> 10진수(12)
		int ot15 = 015;  // 8진수(015) -> 10진수(13)
		int ot16 = 016;  // 8진수(016) -> 10진수(14)
		int ot17 = 017;  // 8진수(017) -> 10진수(15)
		
		System.out.println("octal(ot)=" + ot);
		System.out.println("octal(ot10)=" + ot10);
		System.out.println("octal(ot11)=" + ot11);
		System.out.println("octal(ot12)=" + ot12);
		System.out.println("octal(ot13)=" + ot13);
		System.out.println("octal(ot14)=" + ot14);
		System.out.println("octal(ot15)=" + ot15);
		System.out.println("octal(ot16)=" + ot16);
		System.out.println("octal(ot17)=" + ot17);
		
	}
}

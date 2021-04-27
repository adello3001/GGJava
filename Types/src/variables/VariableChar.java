/*
 * 문자(char)
 * 작은따옴표(')로 양쪽을 묶는다.
 * 단일문자, 하나의 문자 처리
 * 영문(A-Z, a-z)
 * 숫자(0-9)
 * 특수문자
 * 다국어
 */
public class VariableChar {
	public static void main(String[] args) {
		char A = 'A';
		char han = '한';
		char tab = '\t';
		char lf = '\n';
		char geul = '글';
		
		System.out.println("A=" + A);
		System.out.println("han=" + han);
		System.out.println("tab=" + "1234567890");
		System.out.println("tab=" + tab + "TAB");
		System.out.println("lf=" + lf);
		System.out.println("geul=" + geul);
		
		char dq1 = '"';
		char dq2 = '\"';
		char sl1 = '\\';
		
		System.out.println("dq1=" + dq1);
		System.out.println("dq2=" + dq2);
		System.out.println("sl1=" + sl1);
		
		char ucA = '\u0041'; // 'A'
		char ucB = '\u0042'; // 'B'
		System.out.println("ucA=" + ucA);
		System.out.println("ucB=" + ucB);
		
	}

}

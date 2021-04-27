/*
 * 변수(Variable)
 * 16진수값은 정수값 앞에 0x를 붙인다. (0xa)
 */
public class VariableIntegerHexa {

	public static void main(String[] args) {
		int dc = 10;  // 10진수
		int hx = 0xa; // 16진수
		
		System.out.println("decimal(dc)=" + dc);  
		System.out.println("hexa-decimal(hx)=" + hx);
		
		int a = 0xa; // 10진수 10
		int b = 0xb; // 10진수 11
		int c = 0xc; // 10진수 12
		int d = 0xd; // 10진수 13
		int e = 0xe; // 10진수 14
		int f = 0xf; // 10진수 15
		System.out.println("hexa-decimal(a)=" + a);
		System.out.println("hexa-decimal(b)=" + b);
		System.out.println("hexa-decimal(c)=" + c);
		System.out.println("hexa-decimal(d)=" + d);
		System.out.println("hexa-decimal(e)=" + e);
		System.out.println("hexa-decimal(f)=" + f);
	}
}

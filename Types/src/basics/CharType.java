/*
 * 문자타입(char)
 * 1. 2바이트 양의 정수(0~65535, 0x0000~0xffff)
 * 2. 유니코드(Unicode) 2바이트
 * 3. 작은따옴표(')로 감싼다.
 */

package basics;

public class CharType {

	public static void main(String[] args) {
		char ch = 65;
		char chA = 0x41;
		char chA1 = 0x0041;		
		char A = 'A';
		char a = 'a';
		char han = '한';
		char uc = '\uac00';
		
		System.out.println(ch);
		System.out.println(chA);
		System.out.println(chA1);
		System.out.println(A);
		System.out.println(a);
		System.out.println(han);
		System.out.println(uc);
	}
}

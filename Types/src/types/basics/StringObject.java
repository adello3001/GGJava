/*
 * 스트링(문자열) 객체
 * 기본타입이 아니며 클래스 타입
 * String 변수는 참조 변수(*)
 * 문자열은 문자들의 집합
 * 큰따옴표(")로 문자열을 묶는다.
 * 참조변수: 
 */
package basics;

public class StringObject {

	public static void main(String[] args) {
		String empty = ""; 			// 빈문자열
		String name = "홍길동";
		String alphabet = "abcdefg";
		String hello = "Hello";
		String world = "World";
		String helloworld = hello + ", " + world; // plus(+)로 문자열을 결합 할 수 있다.
		
		System.out.println("empty=" + "[" + empty + "]");
		System.out.println(name);
		System.out.println(alphabet);
		System.out.println(hello);
		System.out.println(world);
		System.out.println(helloworld);
	}

}

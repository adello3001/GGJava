package operators;
/*
 * 문자열 연산(==. !=)
 * 문자열 연산은 값을 비교하는 것이 아니라 값이 저장된 위치(메모리 번지)를 비교한다.
 * 
 */
public class StringOper {

	public static void main(String[] args) {
		String str1 = "abc";             // 데이터(.TEXT) 영역에 컴파일 단계에서 생성된 위치를 참조
		String str2 = "abc";             // 데이터(.TEXT) 영역에 컴파일 단계에서 생성된 위치를 참조
		String str3 = new String("abc"); // heap(동적으로 생성되는 메모리 영역)
		String str4 = str3;              // link(연결, 동일한 heap의 메모리 번지를 참조)
		
		boolean eqstr = (str1 == str2);  // 참조 위치를 비교(값을 비교하는 것이 아니다)
		boolean nestr = (str1 != str2);
		System.out.printf("str1(%s) == str2(%s) -> (%b)\n",  str1, str2, eqstr);
		System.out.printf("str1(%s) != str2(%s) -> (%b)\n",  str1, str2, nestr);
		
		boolean eqstr3 = (str1 == str3);
		boolean nestr3 = (str1 != str3);
		System.out.printf("str1(%s) == str3(%s) -> (%b)\n",  str1, str3, eqstr3);
		System.out.printf("str1(%s) != str3(%s) -> (%b)\n",  str1, str3, nestr3);

		boolean eqstr4 = (str3 == str4);
		boolean nestr4 = (str4 != str4);
		System.out.printf("str3(%s) == str4(%s) -> (%b)\n",  str3, str4, eqstr4);
		System.out.printf("str4(%s) != str4(%s) -> (%b)\n",  str3, str4, nestr4);
		
		// 문자열의 값을 비교
		boolean str1n3 = str1.equals(str3);
		System.out.printf("String.equals: str1(%s) == str3(%s) -> (%b)\n",  str1, str3, str1n3); // 같다(true)
		
	}

}

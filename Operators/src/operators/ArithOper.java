package operators;
/*
 * 산술연산자(+, -, *, /, %)
 *   - 더하기 : +
 *   - 빼기 : -
 *   - 곱하기 : *(아스터리스크)
 *   - 나누기 : /(슬레쉬)
 *   - 나머지 : % 
 */
public class ArithOper {

	public static void main(String[] args) {
		// 문자열(+)
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + " " + str2 + "!!!";
		System.out.println(str3);
		
		String str4 = str3 + 99;
		System.out.println(str4);
		
		
		// 더하기
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.printf("a(%d)(%x) + b(%d)(%x) = c(%d)(%x)\n", a, a, b, b, c, c);
		
		// 빼기
		int d = c - 10;
		int e = d - a;
		int f;
		f = d + e - b;
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		
		// 곱하기
		int gg = 8 * 8;
		int g1 = gg * 1;
		int g2 = gg * 2;
		int g3 = gg * -1;
		
		System.out.println("gg=" + gg);
		System.out.println("g1=" + g1);
		System.out.println("g2=" + g2);
		System.out.println("g3=" + g3);
		
		// 나누기
		int d1 = g2 / 2;
		int d2 = g2 / 3; // 정수의 나눗셈은 소숫점이하를 버린다.
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		
		// 나머지
		int n1 = g2 / 3;       // 3으로 나눈 몫
		int n2 = g2 - n1 * 3;  // 3으로 나눈 나머지: n1*3 -> x, g2 - x 
		int n3 = g2 % 3;       // 3으로 나눈 나머지 값(0,1,2)
		System.out.println("몫: n1=" + n1);
		System.out.println("나머지: n2=" + n2);
		System.out.println("나머지: n3=" + n3);
		
		// 산술연산자 우선순위(동일한 연산자는 왼쪽에서 오른쪽으로 계산)
		int p1 = 100 * 2 / 3 % 5;
		System.out.println("연산자우선순위: p1=" + p1);
		

		// 산술연산자 우선순위(복합 연산자)
		int p2 = 100 + 2 - 3 * 5;
		System.out.println("연산자우선순위: p2=" + p2);
		
		// 산술연산자 우선순위(괄호)
		int p3 = 100 + (2 - 3) * 5;
		System.out.println("연산자우선순위: p3=" + p3);
		
		// 산술연산자 우선순위(괄호)
		int p4 = (100 + (2 - 3)) * 5;
		System.out.println("연산자우선순위: p4=" + p4);
		
		// 할당연산자(=)
		int x1, x2;
		int x3 = x2 = x1 = 6;
		System.out.printf("x1(%d), x2(%d), x3(%d)%n", x1, x2, x3);
		

		// 할당연산자(=)
		// int y1 = 1;
		// int y2 = 2;
		int y1 = 1, y2 = 2;
		int y3 = y2 = y1 = 6;
		System.out.printf("y1(%d), y2(%d), y3(%d)%n", y1, y2, y3);
		
		// 부호연산자(sign: +, -)
		int s1 = -1;
		int s2 = +2;
		int s3 = -y3; 
		int s4 = y3 * -1; 
		System.out.printf("s1(%d), s2(%d), [ s3(%d) 같다 s4(%d) ]%n", s1, s2, s3, s4);
		
		// 부호연산자(short)
		// short를 부호연산자를 쓰면 int면 형변환이 발생한다.
		// 그러므로 int 타입으로 값을 할당하거나 short로 강제 타입변환을 해야 한다.
		short sh1 = 99;
		// short sh2 = -sh1; // Type mismatch: cannot convert from int to short
		int sh2 = -sh1;      // short를 int로 할당
		short sh3 = (short)-sh1; // 강제 타입 케스팅
		
		System.out.printf("*** sh1(%d) sh2(%d) sh3(%d)%n", sh1, sh2, sh3);
		
		// 증가연산자(++) : 1씩 증가
		int pp = 0;
		++pp;  // 1증가(pp = pp + 1)
		System.out.println(pp);
		
		pp++; // 1증가(pp = pp + 1)
		System.out.println(pp);
		
		System.out.println(++pp);
		System.out.println(pp++);  // 참조 후 증가

		System.out.println(pp);

		// 감소연산자( --) : 1씩 감소
		int mm = 0;
		--mm;  // 1감소(mm = mm - 1)
		System.out.println("감소연산자:" + mm);
		
		mm--; // 1감소(mm = mm - 1)
		System.out.println(mm);
		
		System.out.println(--mm);
		System.out.println(mm--);  // 참조 후 증가

		System.out.println(mm);
		
		System.out.printf("pp(%d), mm(%d)\n",  pp, mm);
		int pp1 = pp++ + --mm; // pp1(4) + (-5) -> pp1(-1) -> pp(5) 
		//int pp1 = pp+++--mm; // pp1(4) + (-5) -> pp1(-1) -> pp(5) 
		System.out.printf("pp(%d), mm(%d), pp1(%d)\n",  pp, mm, pp1);
	}
}

package bitoper;
/*
 * 비트 이동 연산자
 *  - 왼쪽이동(<<) :  a << b, a를 b만큼 왼쪽으로 이동
 *  - 오른쪽이동(>>) : a >> b, a를 b만큼 오른쪽으로 이동(MSB가 채워진다)
 *  - 오른쪽이동(>>>) : a >>> b, a를 b만큼 오른쪽으로 이동(zero로 채워진다)
 */
public class BitShiftOper2 {

	public static void main(String[] args) {
		/*
		 * [문제] 0x01을 가지고 0x02, 0x04, 0x08 만들어라.
		 * 조건: 비트 이동 연산자만을 사용하라.
		 */
		int one = 0x01;
		/*
		int two = one << 1;
		int four = one << 2;
		int eight = one << 3;
		*/
		int two = one << 1;
		int four = two << 1;
		int eight = four << 1;
		
		PrintBinaryString("one", one);
		PrintBinaryString("two", two);
		PrintBinaryString("four", four);
		PrintBinaryString("eight", eight);
		
	}
	
	public static void PrintBinaryString(String title, int value) {
		String strbin = Integer.toBinaryString(value);
		System.out.printf("%s: value(%d)(0x%x), [%s]\n", title, value, value, strbin);
	}
}

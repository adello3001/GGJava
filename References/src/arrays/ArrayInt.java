package arrays;
/*
 * 배열(Array)
 *   - 배열은 동일한 자료들의 연속된 모음
 *   - 빠르게 자료를 처리하는데 유용
 *   - 배열의 선언은 대괄호 []
 *   - 초기값 지정은 중괄로 {}
 *   - 초기값을 지정한 것으로 배열의 크기가 결정
 */
public class ArrayInt {

	public static void main(String[] args) {
		// 배열을 선언하는 방법으로 a, b는 동일
		int[] a = { 1, 2, 3, 0}; // 정수배열 4개
		int b[] = { 4, 5, 6, 0}; // 정수배열 4개
		
		int ca = a[0] + a[1] + a[2]; // 배열의 값을 참조(읽음)
		int cb = b[2] + b[0] + b[1]; // 배열의 값을 참조(읽음)
		
		a[3] = a[0] + a[1] + a[2]; // 배열의 3번 요소에 값을 할당(지정)
		b[3] = b[2] + b[0] + b[1]; // 배열의 3번 요소에 값을 할당(지정)
		
		System.out.printf("a: [%d]+[%d]+[%d]=[%d][%d]\n", a[0], a[1], a[2], ca, a[3]);
		System.out.printf("b: [%d]+[%d]+[%d]=[%d][%d]\n", b[0], b[1], b[2], cb, b[3]);
		
		a[3] = a[0] + a[1] + a[3]; // 1 + 2 + 6 -> 9
		System.out.printf("a: a0[%d], a1[%d], a3[%d]\n", a[0], a[1], a[3]);
	}

}

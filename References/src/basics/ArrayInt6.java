package basics;
/*
 * 배열(Array)
 *   - 배열은 동일한 자료들의 연속된 모음
 *   - 빠르게 자료를 처리하는데 유용
 *   - 배열의 선언은 대괄호 []
 *   - 초기값 지정은 중괄로 {}
 *   - 초기값을 지정한 것으로 배열의 크기가 결정
 */
public class ArrayInt6 {

	public static void main(String[] args) {
		int[] a = new int[]{ 1, 3, 5, 7 };
		int[] b = new int[4];
		int[] c = new int[4];
		
		for(int col = 0; col < a.length; col++) {
			System.out.printf("a[%d]=[%d]\n", col, a[col]);
			b[col] = a[col];
		}
		
		System.out.println("[b]");
		for(int col = 0; col < b.length; col++) {
			System.out.printf("b[%d]=[%d]\n", col, b[col]);
		}
		
		System.out.println("[x]");
		System.arraycopy(a, 0, c, 0, a.length);
		for(int colx : c) {
			System.out.printf("x=[%d]\n", colx);
		}
		
		
	}

}

package arrays;
/*
 * 배열(Array)
 *   - 배열은 동일한 자료들의 연속된 모음
 *   - 빠르게 자료를 처리하는데 유용
 *   - 배열의 선언은 대괄호 []
 *   - 초기값 지정은 중괄로 {}
 *   - 초기값을 지정한 것으로 배열의 크기가 결정
 */
public class ArrayInt3 {

	public static void main(String[] args) {
		int[] a = new int[4];  // 초기값을 지정하지 않으면 zero(0)으로 초기화
		
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		
		int tot = a[0] + a[1] + a[2] + a[3];
		
		System.out.printf("a: [%d]+[%d]+[%d]+[%d]=[%d]\n", a[0], a[1], a[2], a[3], tot);
	}

}

package arrays;
/*
 * 배열(Array)
 *   - 배열은 동일한 자료들의 연속된 모음
 *   - 빠르게 자료를 처리하는데 유용
 *   - 배열의 선언은 대괄호 []
 *   - 초기값 지정은 중괄로 {}
 *   - 초기값을 지정한 것으로 배열의 크기가 결정
 */
public class ArrayInt5 {

	public static void main(String[] args) {
		int[] a = null; // 권고
		
		if(a == null) {
			System.out.println("a is null :" + a);
			a = new int[]{ 1, 3, 5, 0 };
		}
		
		// The final field array.length cannot be assigned
		// a.length = 5; 
		
		//  java.lang.ArrayIndexOutOfBoundsException
		// a[-1] = 100;
		// a[4] = 100;
		
		for(int cnt = 0; cnt < a.length - 1; cnt++) {
			a[3] += a[cnt];
		}
		
		System.out.printf("a: [%d]+[%d]+[%d]=[%d]\n", a[0], a[1], a[2], a[3]);
	}

}

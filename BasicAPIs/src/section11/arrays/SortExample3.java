<<<<<<< HEAD
=======
/*
 * 정렬(Sort)
 * - 오름차순: 작은 값에서 큰 값으로 정렬
 * - 내림차순: 큰 값에서 작은 값으로 정렬
 */
>>>>>>> 1fbe7edd69de109dbaa01cd627ce8534381e2612
package section11.arrays;

import java.util.Arrays;
import java.util.Collections;
<<<<<<< HEAD

public class SortExample3 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };

		// 오름차순(ascending) 정렬
		System.out.println("오름차순 출력");
		Arrays.sort(scores);
		System.out.printf("Sorted Array : %s\n", Arrays.toString(scores));

		// 내림차순(ascending) 정렬
		System.out.println("내림차순 출력");
        // Integer[] scores2 = Arrays.stream(scores).boxed().toArray(Integer[]::new); 
		Integer[] scores2 = Arrays.stream(scores).boxed().toArray(Integer[]::new);
        Arrays.sort(scores2, Collections.reverseOrder());
		for(int i = 0; i < scores2.length; i++) {
			System.out.printf("scores[%d]=%d\n", i, scores2[i]);
		}

	}
}

=======
import java.util.stream.IntStream;

public class SortExample3 {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };
		
		Arrays.sort(scores); // 오름차순(ascending)
		
		System.out.println("[오름차순(ascending)]");
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
		
        Integer scores2[] = Arrays.stream(scores).boxed().toArray(Integer[]::new);
        Arrays.sort(scores2, (i1, i2) -> i2 - i1);
        System.out.println("내림차순 출력: "+Arrays.toString(scores2));
	}

}
>>>>>>> 1fbe7edd69de109dbaa01cd627ce8534381e2612

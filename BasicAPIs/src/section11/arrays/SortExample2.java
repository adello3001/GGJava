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

public class SortExample2 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };

		// 오름차순(ascending) 정렬
		System.out.println("오름차순 출력");
		Arrays.sort(scores);
		System.out.printf("Sorted Array : %s\n", Arrays.toString(scores));

		// 내림차순(ascending) 정렬
		System.out.println("내림차순 출력");
        Integer[] scores2 = Arrays.stream(scores).boxed().toArray(Integer[]::new); 
        Arrays.sort(scores2, Collections.reverseOrder());
        System.out.printf("Sorted Array: %s", Arrays.toString(scores2));
	}
}

=======
import java.util.stream.IntStream;

public class SortExample2 {

	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };
		
		Arrays.sort(scores); // 오름차순(ascending)
		
		System.out.println("[오름차순(ascending)]");
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]=%d\n", i, scores[i]);
		}
		
		System.out.println("[내림차순(descending)]");
		Integer[] scores2 = Arrays.stream( scores ).boxed().toArray( Integer[]::new );
		Arrays.sort(scores2, Collections.reverseOrder());
		for(int i = 0; i < scores2.length; i++) {
			System.out.printf("scores2[%d]=%d\n", i, scores2[i]);
		}
		
		System.out.println("[내림차순(descending)]");
		Integer[] scores3 = IntStream.of( scores ).boxed().toArray( Integer[]::new );
		Arrays.sort(scores3, Collections.reverseOrder());
		for(int i = 0; i < scores3.length; i++) {
			System.out.printf("scores3[%d]=%d\n", i, scores3[i]);
		}

	}

}
>>>>>>> 1fbe7edd69de109dbaa01cd627ce8534381e2612

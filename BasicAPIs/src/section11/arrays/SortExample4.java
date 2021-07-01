package section11.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortExample4 {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98, 77, 60 };

		// 오름차순(ascending) 정렬
		System.out.println("오름차순 출력");
		Arrays.sort(scores);
		System.out.printf("Sorted Array : %s\n", Arrays.toString(scores));

		// 내림차순(ascending) 정렬
		System.out.println("내림차순 출력");
        // Integer[] scores2 = Arrays.stream(scores).boxed().toArray(Integer[]::new); 
		// Arrays.sort(scores, Collections.reverseOrder());
	  	System.out.println("내림차순 출력");
	  	System.out.println(Arrays.toString(scores));

	}
}


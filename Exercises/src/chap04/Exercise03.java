package chap04;
/*
 * 1부터 100까지의 정수 중에서 3의 배수의 총합
 */
public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int cnt=1; cnt<=100; cnt++) {
			if(cnt % 3 == 0) {
				sum += cnt;
			}
		}

		System.out.printf("3의 배수의 합(%d)\n", sum);
	}

}

package chap04;
/*
 * 1부터 100까지의 정수 중에서 3의 배수의 총합
 */
public class Exercise3a {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int cnt=0; cnt<=100; cnt += 3) {
			sum += cnt;
		}

		System.out.printf("3의 배수의 합(%d)\n", sum);
	}
}

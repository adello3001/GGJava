package chap03;
/*
 * 십의 자리를 버리는 코드이다.
 * 변수 value의 값이 356이라면 300이 나올 수 있도록 (#1) 코드를 작성하라.
 */
public class Exercise05 {
	public static void main(String[] args) {
		int value = 356;
		// int result = value / 300 * 300;
		int result = value / 100 * 100;
		System.out.println("result=" + result);
	}
}

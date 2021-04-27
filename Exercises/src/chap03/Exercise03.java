package chap03;
/*
 * 논리부정
 */
public class Exercise03 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println("result=" + result); // "가"

	}

}

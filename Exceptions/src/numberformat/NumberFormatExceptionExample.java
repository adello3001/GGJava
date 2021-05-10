package numberformat;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String s1 = "100";
		String s2 = "a100";
		
		int val1 = Integer.parseInt(s1);
		int val2 = Integer.parseInt(s2);
		
		int result = val1 + val2;
		System.out.printf("(%d) + (%d) = result(%d)\n", val1, val2, result);
	}
}

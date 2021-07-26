package section05;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// String
		boolean resultString = Util.compare("3.14", "3");
		System.out.println(resultString);

		// Char
		// int result2 = Util.compare(3.14f,  'A');
		// System.out.println(result);

		// Char -> Integer
		int resultInteger = Util.compare(3.14f,  new Integer('A'));
		System.out.println(resultInteger);

		resultInteger = Util.compare(3.14,  3);
		System.out.println(resultInteger);
		
		resultInteger = Util.compare(3.14,  0.123f);
		System.out.println(resultInteger);

		resultInteger = Util.compare(3.14,  3.14);
		System.out.println(resultInteger);
		
	}

}

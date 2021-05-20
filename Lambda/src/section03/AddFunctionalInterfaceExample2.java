package section03;

public class AddFunctionalInterfaceExample2 {
	public static void main(String[] args) {
		AddFunctionalInterface addFunc = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		
		int result = addFunc.add((int)3.1, (int)4.4);
		System.out.println("result: " + result);
	}
}

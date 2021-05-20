package section03;

public class AddFunctionalInterfaceExample {
	public static void main(String[] args) {
		AddFunctionalInterface addFunc = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		
		int result = addFunc.add(3, 4);
		System.out.println("result: " + result);
	}
}

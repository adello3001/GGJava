package arrayindexoutofbounds;

public class ArrayIndexOutOfBoundsExceptionExample3 {

	public static void main(String[] args) {
		try {
			String s1 = args[0];
			String s2 = args[1];
			
			System.out.println("args[0]" + s1);
			System.out.println("args[1]" + s2);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("main 인자의 갯수가 2보다 작다.");
		}
	}

}

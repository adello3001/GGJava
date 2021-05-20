package section04;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		// Pair<Integer, String> p2 = new Pair<Integer, String>(1, new String("사과"));
		boolean result1 = Util.<Integer, String>compare(p1,p2);
		if(result1) {
			System.out.println("논리적으로 같은 객체(p1, p2)");
		}
		else {
			System.out.println("논리적으로 다른 객체(p1, p2)");
		}
	}

}

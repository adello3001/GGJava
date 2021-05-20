package section04;

public class CompareMethodExample2 {

	public static void main(String[] args) {
		// Pair<String, String> p1 = new Pair<String, String>("과일1", "사과");
		// Pair<String, String> p2 = new Pair<String, String>("과일2", "사과");
		// boolean result1 = Util.<String, String>compare(p1,p2);
		
		Pair<String, String> p1 = new Pair<>("과일1", "사과");
		Pair<String, String> p2 = new Pair<>("과일2", "사과");
		boolean result1 = Util.compare(p1,p2);
		if(result1) {
			System.out.println("논리적으로 같은 객체(p1, p2)");
		}
		else {
			System.out.println("논리적으로 다른 객체(p1, p2)");
		}
	}

}

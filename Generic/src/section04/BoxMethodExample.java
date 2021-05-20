package section04;

public class BoxMethodExample {

	public static void main(String[] args) {
		Box<Integer> boxInteger = Util.<Integer>boxing(100);
		int val = boxInteger.get();
		
		System.out.println("val=" + val);
	}

}

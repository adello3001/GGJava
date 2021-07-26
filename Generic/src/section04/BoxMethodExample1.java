package section04;

public class BoxMethodExample1 {

	public static void main(String[] args) {
		Box<Integer> boxInteger = Util.boxing(100);
		int val = boxInteger.get();
		
		System.out.println("val=" + val);
	}

}

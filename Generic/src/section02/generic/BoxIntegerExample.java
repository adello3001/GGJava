package section02.generic;

public class BoxIntegerExample {

	public static void main(String[] args) {
		// Box<int> box = new Box<int>();
		Box<Integer> box = new Box<Integer>();
		box.set(99);
		
		Integer i1 = box.get();
		int i2 = box.get();
		System.out.println(i1);
		System.out.println(i2);
	}

}

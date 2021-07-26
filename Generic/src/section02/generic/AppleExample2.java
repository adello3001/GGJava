package section02.generic;

public class AppleExample2 {

	public static void main(String[] args) {
		Apple apple = new Apple();
		// apple.set(new Integer(100));
		apple.set(100);
		
		// Integer val = (Integer)apple.get();
		int val = (int)apple.get();
		System.out.println(val);
	}
}

package section02.generic;

public class AppleExample {

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.set("apple");
		
		String str = (String)apple.get();
		System.out.println(str);
		
		apple.set(new String("pine apple"));
		String pineapple = (String)apple.get();
		System.out.println(pineapple);
	}
}

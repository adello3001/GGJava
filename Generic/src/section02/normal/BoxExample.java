package section02.normal;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String str = (String)box.get();
		System.out.println(str);
		
		box.set(100);
		int x = (int)box.get();
		System.out.println(x);

		/*
		 * Object로 선언하게 되면 모든 타입의 값을 저장할 수 있지만
		 * 잘못된 캐스팅으로 인한 오류의 가능성이 있다.
		 */
		box.set(new Apple());
		// String apple = (String)box.get();
		// int apple = (int)box.get();
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}

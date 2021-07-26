package section02.generic;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("제너릭");
		
		// 캐스팅을 할 필요가 없다.
		// String str = (String)box.get();
		String str = box.get();
		System.out.println(str);
	}

}

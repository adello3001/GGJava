package section02.normal;

public class BoxExample3 {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		processBox(box);
		
		Apple apple = new Apple();
		apple.set("파인애플");
		processApple(apple);
	}
	
	static void processBox(Box box) {
		System.out.println("Box:" + box.get());
	}
	
	static void processApple(Apple apple) {
		System.out.println("Apple:" + apple.get());
	}
}

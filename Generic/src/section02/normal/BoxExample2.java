package section02.normal;

public class BoxExample2 {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		processObject(box);
		
		Apple apple = new Apple();
		apple.set("파인애플");
		processObject(apple);
	}
	
	static void processObject(Object object) {
		if(object instanceof Box) {
			Box box = (Box)object;
			System.out.println("Box:" + box.get());
		}
		else if(object instanceof Apple) {
			Apple apple = (Apple)object;
			System.out.println("Apple:" + apple.get());
		}
	}
}

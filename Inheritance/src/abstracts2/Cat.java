package abstracts2;

public class Cat extends Animal {
	Cat() {
		this.kind = "고양이";
	}
	
	@Override
	public void move() {
		System.out.println("고양이 걷거나 달린다.");
	}
	
	@Override
	public void sound() {
		System.out.println("고양이는 짖는다.");
	}
	
	public void breathe() {
		System.out.println("고양이도 호흡을 한다.");
	}
}

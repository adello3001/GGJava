package abstracts2;

public class Bird extends Animal {
	Bird() {
		this.kind = "새";
	}

	@Override
	public void move() {
		System.out.println("새는 난다.");
	}
	
	@Override
	public void sound() {
		System.out.println("새는 기저귄다.");
	}
	
	public void fly() {
		System.out.println("새는 난다.");
	}
}

package abstracts2;

public class Dog extends Animal {
	Dog() {
		this.kind = "강아지";
	}
	
	@Override
	public void move() {
		System.out.println("개는 걷거나 달린다.");
	}
	
	@Override
	public void sound() {
		System.out.println("개는 짖는다.");
	}
}

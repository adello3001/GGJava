package abstracts;

public class Dog extends Animal {
	
	@Override
	public void move() {
		System.out.println("개는 걷거나 달린다.");
	}
	
	public void sound() {
		System.out.println("개는 짖는다.");
	}
}

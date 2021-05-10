package abstracts2;

public class Tiger extends Cat {
	Tiger() {
		this.kind = "호랑이";
	}
	
	@Override
	public void move() {
		System.out.println("호랑이 걷거나 달린다.");
	}
	
	@Override
	public void sound() {
		System.out.println("호랑이는 포효한다.");
	}
	
	public void breathe() {
		System.out.println("호랑이도 호흡을 한다.");
	}
}

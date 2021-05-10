package abstracts2;

public class Fish extends Animal {
	Fish() {
		this.kind = "물고기";
	}

	@Override
	public void move() {
		System.out.println("물고기는 헤엄친다.");
	}
	
	@Override
	public void sound() {
		System.out.println("물고기는 뻐끔거린다.");
	}
	
	@Override
	public void breathe() {
		System.out.println("몰고기는 허파로 물속에 있는 산소를 흡수하여 호흡을 한다.");
	}
	
	public void swim() {
		System.out.println("물고기는 헤엄친다.");
	}
}

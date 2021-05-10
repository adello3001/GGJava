package abstracts;

public class AnimalExample1 {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Fish fish = new Fish();
		Insect insect = new Insect();
		
		bird.move();
		fish.move();
		insect.move();
	}

}

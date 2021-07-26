package abstracts;

public class AnimalExample3 {

	public static void main(String[] args) {
		Animal bird = new Bird();
		Animal fish = new Fish();
		Animal insect = new Insect();
		
		bird.move();
		fish.move();
		insect.move();
	}

}

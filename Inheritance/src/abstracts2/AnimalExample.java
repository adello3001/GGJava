package abstracts2;

public class AnimalExample {

	public static void main(String[] args) {	
		animalSpecify(new Bird());
		animalSpecify(new Fish());
		animalSpecify(new Insect());
		animalSpecify(new Dog());

	}
	
	public static void animalSpecify(Animal animal) {
		System.out.printf("[ %sÀÇ Æ¯Â¡ ]\n", animal.kind);
		animal.breathe();
		animal.move();
		animal.sound();
		System.out.println("-------------------------------------");
	}

}

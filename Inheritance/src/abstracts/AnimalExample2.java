package abstracts;

public class AnimalExample2 {

	public static void main(String[] args) {	
		System.out.println("[ainmalMove]");
		animalMove(new Bird());
		animalMove(new Fish());
		animalMove(new Insect());
		
		System.out.println("[animalMove2]");
		animalMove2(new Bird());
		animalMove2(new Fish());
		animalMove2(new Insect());
		
	}
	
	public static void animalMove(Animal animal) {
		animal.move();
	}
	
	public static void animalMove2(Animal animal) {
		if(animal instanceof Bird) {
			animal.move();
		}
		else if(animal instanceof Fish) {
			animal.move();
		}
		else if(animal instanceof Insect) {
			animal.move();
		}
	}

}

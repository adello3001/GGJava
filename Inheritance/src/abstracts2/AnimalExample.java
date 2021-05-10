package abstracts2;

public class AnimalExample {

	public static void main(String[] args) {
		animalMove(new Bird());
		animalMove(new Fish());
		animalMove(new Insect());
	}
	
	public static void animalMove(Animal animal) {
		animal.move();

		if(animal instanceof Bird) {
			((Bird)animal).fly();
		}
		else if(animal instanceof Fish) {
			((Fish)animal).swim();
		}
		else if(animal instanceof Insect) {
			((Insect)animal).crawl();
		}
	}
}

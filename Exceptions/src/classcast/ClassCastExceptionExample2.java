package classcast;

public class ClassCastExceptionExample2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			System.out.println("Dog...");
			Dog dog = (Dog)animal;
		}
		else if(animal instanceof Cat) {
			System.out.println("Cat...");
			Cat cat = (Cat)animal;
		}
	}
}

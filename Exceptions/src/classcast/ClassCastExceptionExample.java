package classcast;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); // ClassCastException
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog)animal;
	}
}

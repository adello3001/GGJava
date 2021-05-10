package abstracts2;

public class TigerExample {

	public static void main(String[] args) {
		Animal animal = new Tiger();
		animal.breathe();
		
		Cat cat = (Cat)animal;
		cat.breathe();
		
		Tiger tiger = (Tiger)animal;
		tiger.breathe();
	}
}

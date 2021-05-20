package section06;

public class Person {
	String name;
	Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + "\n";
	}

}

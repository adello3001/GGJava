package anonymous.parents;

public class Child extends Parent {
	@Override
	void parentMethod(String loc) {
		System.out.println("Child.parentMethod() -> " + loc);
	}
}

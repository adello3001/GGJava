<<<<<<< HEAD
package anonymous.parents;

public class Child extends Parent {
	Child() {}
	
	@Override
	void parentMethod(String loc) {
		System.out.println("Child.parentMethod() ->" + loc);
	}
}
=======
package anonymous.parents;

public class Child extends Parent {
	@Override
	void parentMethod(String loc) {
		System.out.println("Child.parentMethod() -> " + loc);
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

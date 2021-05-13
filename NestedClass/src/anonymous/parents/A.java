<<<<<<< HEAD
package anonymous.parents;

public class A {
	Parent field = new Child();
	
	void method() {
		Parent localVar = new Child();
		localVar.parentMethod("A.method");
	}

	public static void main(String[] args) {
		A a = new A();
		a.field.parentMethod("A.main");
		a.method();
	}
}
=======
package anonymous.parents;

public class A {
	Parent field = new Child();
	
	void method() {
		Parent localVar = new Child();
		localVar.parentMethod("A.method");
	}

	public static void main(String[] args) {
		A a = new A();
		a.field.parentMethod("A.main");
		a.method();
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

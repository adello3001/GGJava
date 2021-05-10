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

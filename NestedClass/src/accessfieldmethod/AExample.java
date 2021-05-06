package accessfieldmethod;

public class AExample {

	public static void main(String[] args) {
		A.staticFieldC.methodC();
		
		A a = new A();
		a.instanceMethod();
		
		A.staticMethod();
		a.staticMethod();
	}

}

package exercises.exercise05;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.field.run();
		a.method1();
		a.method2(new Vehicle() {
			@Override
			public void run() {}
		});

	}

}

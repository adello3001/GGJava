<<<<<<< HEAD
package anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 기상");
				study();
			}
		});
	}
}
=======
package anonymous;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 기상");
				study();
			}
		});
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

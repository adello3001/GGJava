package anonymous;

public class AnonymousExample2 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		
		Person ps = new Person() {
			void run() {
				System.out.println("달린다");
			}
			
			@Override
			void wake() {
				System.out.print("> 5시에 기상 : ");
				run();
			}
		};
		
		anony.method2(ps);
		
		anony.method2(new Person() {
			int km = 42;
			void run() {
				System.out.printf("(%d)Km를 달린다\n", km);
			}
			
			@Override
			void wake() {
				System.out.print("> 4시에 기상 : ");
				run();
			}
		});
	}
}

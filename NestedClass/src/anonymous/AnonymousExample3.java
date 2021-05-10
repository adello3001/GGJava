package anonymous;

public class AnonymousExample3 {

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
				System.out.println("5시에 기상");
				run();
			}
		};
		
		anony.method2(ps);
		
		anony.method2(new Person() {
			int km = 42;
			void run(int km) {
				this.km = km;
				for(int cnt = 0; cnt <= this.km; cnt++) {
					System.out.printf("현재(%d/%d)Km를 달리고 있습니다.\n", cnt, km);
				}
			}
			
			@Override
			void wake() {
				System.out.println("4시에 기상");
				run(42);
			}
		});
	}
}

package anonymous;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("���");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� ���");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void work() {
				System.out.println("��å");
			}
			
			@Override
			void wake() {
				System.out.println("7�ÿ� ���");
				work();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}

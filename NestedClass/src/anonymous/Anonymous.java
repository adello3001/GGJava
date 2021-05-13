<<<<<<< HEAD
package anonymous;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 기상");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 기상");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}

}
=======
package anonymous;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 기상");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void work() {
				System.out.println("산책");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 기상");
				work();
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

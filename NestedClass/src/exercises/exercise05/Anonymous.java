package exercises.exercise05;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
		}
	};
	
	void method1() {
		Vehicle local = new Vehicle() {
			@Override
			public void run() {}
		};
		
		local.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}

}

<<<<<<< HEAD
/*
 * 劳疙 备泅 按眉
 */
package anonymous.interfaces;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV On");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV Off");
		}
	};
	
	void on() {
		this.field.turnOn();
	}
	
	void off() {
		this.field.turnOff();
	}
	
	void audio() {
		RemoteControl audio = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio Off");
			}
		};
		
		audio.turnOn();
		audio.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
=======
/*
 * [劳疙 备泅 按眉]
 */
package anonymous.interfaces;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV On");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV Off");
		}
	};
	
	void on() {
		this.field.turnOn();
	}
	
	void off() {
		this.field.turnOff();
	}
	
	void audio() {
		RemoteControl audio = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio Off");
			}
		};
		
		audio.turnOn();
		audio.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

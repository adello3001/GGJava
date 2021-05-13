<<<<<<< HEAD
package anonymous.interfaces;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// anony.field.turnOn();
		// anony.field.turnOff();
		anony.on();
		anony.off();
		anony.audio();
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV Off");
			}			
		});
	}
}
=======
package anonymous.interfaces;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// anony.field.turnOn();
		// anony.field.turnOff();
		
		anony.on();
		anony.off();
		anony.audio();
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTV On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV Off");
			}
		});
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

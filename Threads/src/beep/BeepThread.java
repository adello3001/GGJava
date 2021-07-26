package beep;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	@Override
	public void run() {
		System.out.println("BeepTask: start...");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.printf("BeepTask: beep(%d)!!!\n", i);
			try {
				Thread.sleep(500); // millisecond(1000���� 1��), 0.5second
			}
			catch(Exception e) {
			}
			System.out.println("BeepTask: end loop...");
		}
		
		System.out.println("BeepTask: stop...");
	}

}

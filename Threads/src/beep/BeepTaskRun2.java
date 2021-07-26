/*
 * Runnable 인터페이스의 익명구현객체를 생성하여
 * Thread의 생성자로 전달하여 스레드를 처리
 */
package beep;

import java.awt.Toolkit;

public class BeepTaskRun2 {

	public static void main(String[] args) {
		Thread beepThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("BeepTask: start...");
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					System.out.printf("BeepTask: beep(%d)!!!\n", i);
					try {
						Thread.sleep(500); // millisecond(1000분의 1초), 0.5second
					}
					catch(Exception e) {
					}
					System.out.println("BeepTask: end...");
				}
			}
		});
		
		// 스레드 시작(백그라운드로 처리)
		beepThread.start();
		
		// 스레드가 종료 되기 전에 먼저 메인 스레드가 종료
		System.out.println("main thread end");
		System.out.println("THE END");

	}
}

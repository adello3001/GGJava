package beep;

public class BeepThreadRun {

	public static void main(String[] args) {
		Thread beepThread = new BeepThread();
		beepThread.start();
		
		// 스레드가 종료 되기 전에 먼저 메인 스레드가 종료
		System.out.println("main thread end");
		System.out.println("THE END");
	}

}

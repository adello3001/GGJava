/*
 * Runnable 인터페이스의 구현클래스(BeepTask)의 객체를 생성하여
 * Thread의 생성자로 전달하여 스레드를 처리
 */
package beep;
public class BeepTaskRun {

	public static void main(String[] args) {
		// 스레드가 처리해야 할 작업
		Runnable beepTask = new BeepTask();
		
		// 스레드 객체 생성
		Thread beepThread = new Thread(beepTask);
		
		// 스레드 시작(백그라운드로 처리)
		beepThread.start();
		
		// 스레드가 종료 되기 전에 먼저 메인 스레드가 종료
		System.out.println("main thread end");
		System.out.println("THE END");

	}
}

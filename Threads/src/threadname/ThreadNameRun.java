/*
 * Thread.setName(), Thread.getName()을 사용하여 스레드를 식별
 */
package threadname;

public class ThreadNameRun {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("메인스레드:" + mainThread.getName());
		
		ThreadT1 t1 = new ThreadT1();
		System.out.println("작업 스레드:" + t1.getName());
		
		ThreadT2 t2 = new ThreadT2();
		System.out.println("작업 스레드:" + t2.getName());
		
		t1.start();
		t2.start();

		System.out.println("THE END");
	}
}

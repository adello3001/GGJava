/*
 * notify : 일시정지 상테에 있는 스레드를 실행 대기 상태로 변경
 * wait: 자신을 실행시킨 스레드를 일시 정지 상태로 변경
 */
package threadstatecontrols.notifies;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA: methodA");
		notify(); // wait 상태에 있는 다른 스레드를 실행대기 상태로 만듦
		
		try {
			wait(); // 자신을 일시 정지 상태로 만듦(ThreadA)
		}
		catch(InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB: methodB");
		notify();
		
		try {
			wait(); // 자신을 일시 정지 상태로 만듦(ThreadB)
		}
		catch(InterruptedException e) {
		}
	}

}

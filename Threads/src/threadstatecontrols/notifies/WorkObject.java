/*
 * notify : �Ͻ����� ���׿� �ִ� �����带 ���� ��� ���·� ����
 * wait: �ڽ��� �����Ų �����带 �Ͻ� ���� ���·� ����
 */
package threadstatecontrols.notifies;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA: methodA");
		notify(); // wait ���¿� �ִ� �ٸ� �����带 ������ ���·� ����
		
		try {
			wait(); // �ڽ��� �Ͻ� ���� ���·� ����(ThreadA)
		}
		catch(InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB: methodB");
		notify();
		
		try {
			wait(); // �ڽ��� �Ͻ� ���� ���·� ����(ThreadB)
		}
		catch(InterruptedException e) {
		}
	}

}

/*
 * Runnable �������̽��� ����Ŭ����(BeepTask)�� ��ü�� �����Ͽ�
 * Thread�� �����ڷ� �����Ͽ� �����带 ó��
 */
package beep;
public class BeepTaskRun {

	public static void main(String[] args) {
		// �����尡 ó���ؾ� �� �۾�
		Runnable beepTask = new BeepTask();
		
		// ������ ��ü ����
		Thread beepThread = new Thread(beepTask);
		
		// ������ ����(��׶���� ó��)
		beepThread.start();
		
		// �����尡 ���� �Ǳ� ���� ���� ���� �����尡 ����
		System.out.println("main thread end");
		System.out.println("THE END");

	}
}

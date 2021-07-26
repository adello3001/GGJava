/*
 * [����ȭ �޼ҵ�]
 *   - ������ �޼ҵ带 ����ȭ
 *   - ���� �����尡 ������ �ϸ� ���� ó���ϰ� �ִ� �����尡 ó���� ������
 *     �ٸ� ������� ����Ͽ� ���������� ó���� �� �ֵ��� ��� ó��
 *     
 * [����ȭ ���]
 *   - ������ ��ü�� ���� ������ ����ȭ
 *   - ���� �����尡 ������ ��Ͽ� �����ϸ� ������ ��ü�� ���� 
 *     ���� ���� �����尡 ó���� ������ �ٸ� ������� ���
 * 
 */

package threadsynchronized;

public class CalcSync {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}

	// �޼ҵ� ����ȭ
	public synchronized void setMemory(int memory) {
		System.out.println("CalcSync::setMemory: > " + Thread.currentThread().getName());

		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2 second
		}
		catch(InterruptedException e) {
		}
		
		System.out.println("CalcSync::setMemory: < " + Thread.currentThread().getName());
	}

	// ����ȭ ���
	public void setMemoryBlock(int memory) {
		System.out.println("CalcSync::setMemoryBlock: > " + Thread.currentThread().getName());
		
		synchronized(this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000); // 2 second
			}
			catch(InterruptedException e) {
			}
			
			System.out.println("CalcSync::setMemoryBlock: < " + Thread.currentThread().getName() + ":" + this.memory);
		}
	}

}

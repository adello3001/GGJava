/*
 * [동기화 메소드]
 *   - 지정된 메소드를 동기화
 *   - 여러 스레드가 접근을 하면 먼저 처리하고 있는 스레드가 처리할 때까지
 *     다른 스레드는 대기하여 순차적으로 처리할 수 있도록 잠금 처리
 *     
 * [동기화 블록]
 *   - 지정된 객체에 대한 접근을 동기화
 *   - 여러 스레드가 지정된 블록에 접근하면 지정된 객체에 대해 
 *     먼저 들어온 스레드가 처리할 때까지 다른 스레드는 대기
 * 
 */

package threadsynchronized;

public class CalcSync {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}

	// 메소드 동기화
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

	// 동기화 블록
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

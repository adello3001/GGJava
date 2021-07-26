package threadsynchronized;

public class Calc {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	public void setMemory(int memory) {
		System.out.println("setMemory > " + Thread.currentThread().getName() + ":" + this.memory);

		this.memory = memory;
		
		try {
			Thread.sleep(2000); // 2 second
		}
		catch(InterruptedException e) {
		}
		
		System.out.println("setMemory < " + Thread.currentThread().getName() + ":" + this.memory);
	}
}

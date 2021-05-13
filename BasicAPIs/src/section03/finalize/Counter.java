package section03.finalize;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.printf("Counter:finalize.no(%d)\n", this.no);
	}
}

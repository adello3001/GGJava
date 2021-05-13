package section03.finalize;

public class CounterExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int cnt = 0; cnt < 500; cnt++) {
			System.out.printf("Counter:no(%d)\n", cnt);
			
			counter = new Counter(cnt);
			counter = null;
			System.gc();
		}
	}
}

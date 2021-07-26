package threadsynchronized;

public class CalcSyncUserRun {

	public static void main(String[] args) {
		CalcSync calc = new CalcSync();
		
		CalcSyncUser1 user1 = new CalcSyncUser1();
		user1.setCalc(calc);
		user1.start();
		
		CalcSyncUser2 user2 = new CalcSyncUser2();
		user2.setCalc(calc);
		user2.start();
	}
}

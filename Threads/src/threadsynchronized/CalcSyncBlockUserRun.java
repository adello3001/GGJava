package threadsynchronized;

public class CalcSyncBlockUserRun {

	public static void main(String[] args) {
		CalcSync calc = new CalcSync();
		
		CalcSyncBlockUser1 user1 = new CalcSyncBlockUser1();
		user1.setCalc(calc);
		user1.start();
		
		CalcSyncBlockUser2 user2 = new CalcSyncBlockUser2();
		user2.setCalc(calc);
		user2.start();
		

	}

}

package userexception.balance;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		balanceAccount("현재잔고", account);
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInsufficientException e) {
			System.out.println("예외:" + e.getMessage());
			balanceAccount("현재잔고", account);
			
			System.out.println("---------------------------------");
			e.printStackTrace();
			System.out.println("---------------------------------");
		}
		
		System.out.println("처리 완료");
	}
	
	static void balanceAccount(String title, Account account) {
		System.out.println(title + ": " + account.getBalance());
	}

}

package userexception.balance;

public class AccountExample2 {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(100000);
		balanceAccount("현재잔고", account);
		
		try {
			account.withdraw(500000);
		}
		catch(BalanceInsufficientException e) {
			e.balanceAccount("잔고오류");
		}
		
		System.out.println("처리 완료");
	}
	
	static void balanceAccount(String title, Account account) {
		System.out.println(title + ": " + account.getBalance());
	}

}

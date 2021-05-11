package userexception.balance;

public class BalanceInsufficientException extends Exception {
	private Account account;
	
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(Account account, String message) {
		super(message);
		this.account = account;
	}
	
	public long getBalance() {
		return this.account.getBalance();
	}
	
	public void setBalance(Account account) {
		this.account = account;
	}
	
	public void balanceAccount(String title) {
		System.out.println(title + ": " + this.account.getBalance());
		System.out.println(getMessage());
	}
}

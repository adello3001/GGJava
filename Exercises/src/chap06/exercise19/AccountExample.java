package chap06.exercise19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		account.printBalance();
		System.out.println("$ «ˆ¿Á¿‹∞Ì: " + account.getBalance());
		
		account.setBalance(-10000);
		account.printBalance();
		System.out.println("$ «ˆ¿Á¿‹∞Ì: " + account.getBalance());

		account.setBalance(2000000);
		account.printBalance();
		System.out.println("$ «ˆ¿Á¿‹∞Ì: " + account.getBalance());

	}

}

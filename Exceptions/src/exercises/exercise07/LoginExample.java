package exercises.exercise07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("while", "12345");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		// id가 "blue"가 아니면 NotExistIDException 발생시킴
		if(!id.equals("blue")) { // if(id.equals("blue") != true)
			throw new NotExistIDException("ID not found...");
		}
		
		System.out.println("login: check password!");
		
		// password가 "12345" 아니면 WrongPasswordException 발생시킴
		if(!password.equals("12345")) { // if(password.equals("12345") != true) {
			throw new WrongPasswordException("Invalid password...");
		}
	}

}

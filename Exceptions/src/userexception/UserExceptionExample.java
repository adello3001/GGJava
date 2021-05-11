package userexception;

public class UserExceptionExample {
	public static void main(String[] args) {
		try {
			// user(null);
			user("홍길동");
		} 
		catch(UserException e) {
			System.out.println("main:" + e.getMessage());
		}
	}

	static void user(String msg) throws UserException {
		if(msg == null) {
			throw new UserException("사용자의 이름이 없습니다.");
		}
		
		System.out.println("user: " + msg);
	}
}

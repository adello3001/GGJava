package userexception;

public class UserRuntimeExceptionExample {
	public static void main(String[] args) {
		try {
			runtime(null);
			// runtime("시스템정보");
		} 
		catch(UserRuntimeException e) {
			System.out.println("main:" + e.getMessage());
		}
	}

	static void runtime(String msg) throws UserRuntimeException {
		if(msg == null) {
			throw new UserRuntimeException("시스템 정보가 없습니다.");
		}
		
		System.out.println("runtime: " + msg);
	}
}

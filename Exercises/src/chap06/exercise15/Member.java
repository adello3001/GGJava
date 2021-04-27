package chap06.exercise15;

public class Member {
	private static final String MEMBER_ID = "hong";
	private static final String MEMBER_PW = "1234";
	
	boolean logined = false;
	
	Member() {
	}
	
	boolean login(String id, String password) {
		if(id.equals(MEMBER_ID) && password.equals(MEMBER_PW)) {
			logined = true;
			return true;
		}
		
		return false;
	}
	
	void logout(String id) {
		if(logined && id.equals(MEMBER_ID)) {
			System.out.printf("id(%s)가 로그아웃 되었습니다.\n", id);
			logined = false;
			return;
		}

		System.out.printf("id(%s)가 없거나, 이미 로그아웃 되었습니다.\n", id);
	}
	
	public static void main(String[] args) {
		Member user = new Member();
		if(user.login("hong",  "1234")) {
			System.out.println("로그인 성공!!!");
		}
		else {
			System.out.println("로그인 실패!!!");
		}
		
		user.logout("hong");
		user.logout("hong");
	}
}

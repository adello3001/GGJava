package abstracts2;

public class TigerExample3 {

	public static void main(String[] args) {
		// 부모 객체를 자식 객체로 캐스팅을 하면 실행 오류가 발생한다.
		// 예외발생(java.lang.ClassCastException)
		Tiger tiger = (Tiger)new Cat();
	}
}

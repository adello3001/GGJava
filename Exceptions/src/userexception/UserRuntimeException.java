/*
 * 사용자 정의 예외 클래스
 * RuntimeException을 상속하게 되면 실행 예외처리를 위한 예외 클래스
 */
package userexception;

public class UserRuntimeException extends RuntimeException {
	UserRuntimeException() {}
	UserRuntimeException(String message) {
		super(message);
	}
}

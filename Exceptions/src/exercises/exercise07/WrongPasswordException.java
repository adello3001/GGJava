package exercises.exercise07;

public class WrongPasswordException extends Exception {
	WrongPasswordException() {}
	WrongPasswordException(String message) {
		super(message);
	}

}

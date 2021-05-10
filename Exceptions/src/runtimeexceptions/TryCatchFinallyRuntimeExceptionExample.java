/*
 * try catch에서 finally는 옵션으로 try나 catch문이 실행 된 후 최종적으로 항상 실행되는 블럭이다. 
 * 정상적으로 try문이 실행되거나 예외가 발생하여 catch문이 실행되어도 최종적으로 항상 시행된다. 
 * finally 블럭에는 반드시 실행되어야 할 처리 루틴을 기술한다.
 */
package runtimeexceptions;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String s1 = "900";
		String s2 = "x100";
		// String s2 = "100";
		
		try {
			int val1 = Integer.parseInt(s1);
			int val2 = Integer.parseInt(s2);
			int result = val1 + val2;
			System.out.println("result=" + result);
		}
		catch(NumberFormatException e) {
			System.out.println("Exception: 숫자로 변환할 수 없는 문자열입니다.");
		}
		finally {
			System.out.println("finally: 문자열을 다시 입력하세요");
		}
	}
}

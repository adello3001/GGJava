/*
 * try catch에서 finally는 옵션으로 try나 catch문이 실행 된 후 최종적으로 항상 실행되는 블럭이다. 
 * 정상적으로 try문이 실행되거나 예외가 발생하여 catch문이 실행되어도 최종적으로 항상 시행된다. 
 * finally 블럭에는 반드시 실행되어야 할 처리 루틴을 기술한다.
 */
package runtimeexceptions;

public class TryCatchFinallyRuntimeExceptionExample4 {

	public static void main(String[] args) {
		System.out.printf("main(args.length=%d)\n", args.length);

		int result = add(args);
		System.out.println("result=" + result);
	}
	
	static int add(String[] args) {
		try {
			String s1 = args[0];
			String s2 = args[1];
			
			int val1 = Integer.parseInt(s1);
			int val2 = Integer.parseInt(s2);
			int result = val1 + val2;
			return result;
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException: 실행 시간 예외 발생 -> " + e.getMessage());
		}
		finally {
			System.out.println("finally: 문자열을 다시 입력하세요");
		}
		
		return -1;
	}
}

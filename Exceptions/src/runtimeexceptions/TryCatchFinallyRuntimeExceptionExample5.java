/*
 * try catch에서 finally는 옵션으로 try나 catch문이 실행 된 후 최종적으로 항상 실행되는 블럭이다. 
 * 정상적으로 try문이 실행되거나 예외가 발생하여 catch문이 실행되어도 최종적으로 항상 시행된다. 
 * finally 블럭에는 반드시 실행되어야 할 처리 루틴을 기술한다.
 */
package runtimeexceptions;

public class TryCatchFinallyRuntimeExceptionExample5 {

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
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException: 숫자로 변환할 수 없는 문자열입니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: 배열 인덱스 범위를 넘어 섰습니다.");
		}
		catch(Exception e) {
			System.out.println("Exception e: 예외 발생!!!!");
		}
		finally {
			System.out.println("finally: 문자열을 다시 입력하세요");
		}
		
		return -1;
	}
}

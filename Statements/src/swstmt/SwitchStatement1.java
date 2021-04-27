package swstmt;
/*
 * 조건문(switch)
 * case 정수:     -> case 1,2,3:
 * case 문자:     -> case 'a', 'A':
 * case 문자열:   -> case "abc":
 */
public class SwitchStatement1 {

	public static void main(String[] args) {
		// int num = (int)(Math.random() * 6) + 1;
		
		int num = 0;
		// int num = 1;
		//int num = 2;
		//int num = 3;
		// int num = 4;
		//int num = 5;
		//int num = 6;
		
		switch(num) {
		case 1:
			System.out.println("num is 1"); break;
			
		case 2:
			System.out.println("num is 2"); break;
			
		case 3:
			System.out.println("num is 3"); break;
			
		case 4:
			System.out.println("num is 4"); break;
			
		case 5:
			System.out.println("num is 5"); break;
			
		case 6:
			System.out.println("num is 6"); break;
		
		default: // 위의 case에 해당되지 않는 값인 경우
			System.out.println("num is other"); break;
		}

	}

}

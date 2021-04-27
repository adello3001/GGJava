package operators;
/*
 *  논리연산자(!, ||, &&)
 *  논리부정(!) : 반대, true -> false, false -> true
 *  논리합(||)  : OR,  A or B,  A 이거나 B. A와 B중에 하나라도 참이면 참
 *  논리곱(&&)  : AND, A and B, A 이고 B,   A와 B가 모두 참이어야 참
 */
public class LogicalOper {

	public static void main(String[] args) {
		
		// 논리부정
		boolean play = true;
		System.out.println("play=" + play);
		
		play = !play;
		System.out.println("play=" + play);

		play = !play;
		System.out.println("play=" + play);
		
		// 논리합, 논리곱
		boolean t = true;
		boolean f = false;
		boolean or = t || f;
		boolean or1 = f || f;
		boolean and = t && f;
		boolean and1 = t && t;
		
		System.out.printf("t(%b) or f(%b) = (%b)%n", t, f, or);
		System.out.printf("f(%b) or f(%b) = (%b)%n", f, f, or1);
		System.out.printf("t(%b) and f(%b) = (%b)%n", t, f, and);
		System.out.printf("t(%b) and t(%b) = (%b)%n", t, t, and1);
	}
}

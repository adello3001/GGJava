package section05;

import java.util.function.IntPredicate;

public class PredicateAndOrNegatteExample {
	public static void main(String[] args) {
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

	public static void predicateAnd() { // 논리곱
		IntPredicate preA = a -> a % 2 == 0;
		IntPredicate preB = a -> a % 3 == 0;
		
		IntPredicate preAB = preA.and(preB); // false = false && true
		boolean result = preAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? -> " + result);
		
		result = preAB.test(6);
		System.out.println("6은 2와 3의 배수입니까? -> " + result);
	}
	
	public static void predicateOr() { // 논리합
		IntPredicate preA = a -> a % 2 == 0;
		IntPredicate preB = a -> a % 3 == 0;
		
		IntPredicate preAB = preA.or(preB); // true = false || true, false = false || false
		
		boolean result = preAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? -> " + result);
		
		result = preAB.test(7);
		System.out.println("7은 2와 3의 배수입니까? -> " + result);
	}
	
	public static void predicateNegate() { // 논리부정
		IntPredicate preA = a -> a % 2 == 0;
		IntPredicate preB = a -> a % 3 == 0;
		
		IntPredicate preAB1 = preA.negate(); // true = false, false = true
		IntPredicate preAB2 = preB.negate(); // true = false, false = true
		
		boolean result = preAB1.test(9);
		System.out.println("9는 홀수 입니까? -> " + result);
		
		result = preAB2.test(9);
		System.out.println("9는 3의 배수가 아닙니까? -> " + ((result) ? "아니오" : "예"));
	}
}

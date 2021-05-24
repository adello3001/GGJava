/*
 * Function의 순차적 연결
 * - Function<>.andThen()
 * - Function<>.compose()
 */
package section05;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("홍길동", "HGD", new Address("조선", "한양")));
		System.out.println("거주도시:" + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("홍길동", "HGD", new Address("조선", "한양")));
		System.out.println("거주도시:" + city);
	}
}

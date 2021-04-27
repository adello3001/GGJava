package operators;
/*
 * 비교연산자(Compare Operator)
 *   - eq: 같다(==)
 *   - ne: 같지 않다(!=)
 *   - gt: 크다(>)
 *   - ge: 크거나 같다(>=)
 *   - lt: 작다(<)
 *   - le: 작거나 같다(<=)
 *   - 비교 연산의 결과는 boolean 이다.
 */
public class CompareOper {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.printf("a(%d), b(%d), c(%d) %n", a, b, c);
		
		boolean eq = a == b; 
		boolean ne = b != b;
		boolean gt = a > b;
		boolean ge = c >= a;
		boolean lt = c < b;
		boolean le = b <= c;

		System.out.printf("boolean eq(%b) = a(%d) == b(%d) %n", eq, a, b);
		System.out.printf("boolean ne(%b) = b(%d) != b(%d) %n", ne, b, b);
		System.out.printf("boolean gt(%b) = a(%d)  > b(%d) %n", gt, a, b);
		System.out.printf("boolean ge(%b) = c(%d) >= a(%d) %n", ge, c, a);
		System.out.printf("boolean lt(%b) = c(%d)  < b(%d) %n", lt, c, b);
		System.out.printf("boolean le(%b) = b(%d) <= c(%d) %n", le, b, c);
		
		char chA = 'A'; // 65
		char chB = 'B'; // 66
		// char chX = 66; // 66
		int chX = 66; // 66

		boolean ltAB = chA < chB;
		boolean gtAB = chA > chB;
		boolean eqAB = chA == chB;
		boolean neAB = chA != chB;
		boolean eqBX = ((int)chB == chX);  // char == int -> int == int

		System.out.printf("boolean ltAB(%b) = chA(%c) < chB(%c) %n", ltAB, chA, chB);
		System.out.printf("boolean gtAB(%b) = chA(%c) > chB(%c) %n", gtAB, chA, chB);
		System.out.printf("boolean eqAB(%b) = chA(%c) == chB(%c) %n", eqAB, chA, chB);
		System.out.printf("boolean neAB(%b) = chA(%c) != chB(%c) %n", neAB, chA, chB);
		System.out.printf("boolean eqBX(%b) = chB(%c) == chX(%c)(%x) ??? %n", eqBX, chB, chX, chX);
		
		double dblD = 3.141592;
		float floF = 3.141592f;
		boolean eqDF = dblD == floF;   // double == float
		System.out.printf("boolean eqDF(%b) = dlbD(%f) == floF(%f) %n", eqDF, dblD, floF); // false

		boolean eqDF2 = (float)dblD == floF;   // (float)double == float
		System.out.printf("boolean eqDF2(%b) = dlbD(%f) == floF(%f) -> Ok! %n", eqDF2, dblD, floF); // true

		boolean eqDF3 = dblD == (double)floF;   // double == float
		System.out.printf("boolean eqDF3(%b) = dlbD(%f) == floF(%f) %n", eqDF3, dblD, floF); // false

		boolean eqDF4 = (int)dblD == (int)floF;   // (int)double == (int)float
		System.out.printf("boolean eqDF2(%b) = dlbD(%d) == floF(%d) -> Ok! %n", eqDF4, (int)dblD, (int)floF); // true


		int IntBoolean = ((float)dblD == floF) ? 1 : 0; // 삼항연산자
		System.out.printf("boolean eqDF5(%d)(%b) = dlbD(%f) == floF(%f) -> Ok! %n", IntBoolean, IntBoolean, dblD, floF); 
		
	}

}

/*
 * 秦矫内靛 积己 抗力
 */
package section04.objects;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		System.out.println(hashCode1());
		System.out.println(hashCode1());
		System.out.println(hashCode2());
		System.out.println(hashCode3());
		System.out.println(hashCode4());
	}
	
	static int hashCode1() {
		return Objects.hash("abc");
	}

	static int hashCode2() {
		return Objects.hash("abc", 1234);
	}

	static int hashCode3() {
		return Objects.hash("abc", 1234, 3.14);
	}

	static int hashCode4() {
		return Objects.hash("abc", 1234, 3.14, true);
	}

}

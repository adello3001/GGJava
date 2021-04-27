/*
 * [final field]
 *   - 초기값이 최초에 한 번 지정되면 수정할 수 없다.
 *   - 초기값을 지정하는 방법
 *     1. 선언할 때 지정
 *     2. 생성자에서 지정
 */
package finalconst;

public class Person {
	final String nation = "Korea";	// 초기값을 선언할 때 지정
	final String ssn;				// 초기값을 생성자에서 지정해야 한다.
	String name;
	
	Person() {
		this.ssn = "20210101-1234567";
		// this.nation = "USA";
	}
	
	Person(String ssn, String name) {
		// this.nation = "USA";
		this.ssn = ssn;
		this.name = name;
	}
	
	void set(String ssn, String name) {
		// this.ssn = ssn;
		this.name = name;
	}
	
	void print() {
		System.out.println("ssn : " + this.ssn);
		System.out.println("name : " + this.name);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.set("987654-7654321", "외국인");
		p1.print();
		
		Person p2 = new Person("123456-1234567", "한국인");
		// p2.nation = "미국";
		p2.print();
	}

}

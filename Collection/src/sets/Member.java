/*
 * 사용자 정의 클래스를 set에서 사용할 때
 * 데이터가 같으면 중복되지 않도록 처리하기 위해서는
 * hashCode(), equals()을 재정의 해야 한다.
 */
package sets;

public class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int hashCode() {
		System.out.printf("[%s][%d][%d]\n", this.name, this.name.hashCode(), this.age);
		return this.name.hashCode() + this.age;
	}
	
	/*
	 * new를 통해서 생성된 객체이므로 다르게 인식 
	public boolean equals(Object obj) {
		System.out.println("equals: " + (this == obj)); 
		return this == obj; 
	}
	*/
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age);
		}
		else {
			return false;
		}
	}
}

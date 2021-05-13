/*
 * [얕은 복제]
 * 객체를 복제하기 위해서는 Cloneable 인터페이스의 구현 클래스를 정의해야 한다.
 * - 참조형 객체는 레퍼런트 주소만 복사
 * - Object.clone()를 사용
 * - CloneNotSupportedException 예외를 처리
 */

package section03.cloneobject;

public class Member implements Cloneable {
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member cloneMember() {
		Member clonedMember = new Member(id, name, password, age, adult);
		return clonedMember;
	}
	
	public Member getMember() {
		Member clonedMember = null;
		
		try {
			clonedMember = (Member)clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Member Object is not supported");
		}
		return clonedMember;
	}
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	

}

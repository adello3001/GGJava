/*
 * [set]
 * 1. 중복해서 들어 가지 않음
 * 2. 순서가 무작위
 * 3. 저장된 순서가 보장되지 않는다.
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMember2 {

	public static void main(String[] args) {
		Set<Member> members = new HashSet<Member>();

		members.add(new Member("자바", 20));
		members.add(new Member("자바", 20));
		
		printMembers(members);
	}
	
	static void printMembers(Set<Member> members) {
		System.out.println("printMembers.size : " + members.size());

		Iterator<Member> it = members.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			System.out.printf("member: name(%s), age(%d) %n", member.name, member.age);
		}
	}

}

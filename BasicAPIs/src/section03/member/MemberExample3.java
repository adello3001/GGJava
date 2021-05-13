package section03.member;

public class MemberExample3 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		printHashCode(obj1);
		printHashCode(obj2);
		printHashCode(obj3);
	}
	
	static void printHashCode(Member member) {
		System.out.printf("id(%s), hashCode(%d)(%s)\n", member.id, member.hashCode(), member);
	}
	
}

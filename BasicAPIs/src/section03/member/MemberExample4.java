package section03.member;

public class MemberExample4 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		printString(obj1);
		printString(obj2);
		printString(obj3);
	}
	
	static void printString(Member member) {
		System.out.printf("> id(%s), hashCode(%d)(%s)\n", 
				member.id, member.hashCode(), member);
		
		System.out.printf("] id(%s), hashCode(%d)(%s)\n", 
				member.id, member.hashCode(), member.toString());
		
	}
	
}

package section03.cloneobject;

public class MemberExample2 {

	public static void main(String[] args) {
		Member original = new Member("blue", "블루맨", "12345", 25, true);
		
		Member cloned = original.cloneMember();
		
		System.out.printf("[복제] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[원본] (%s), (%s)\n", original.name, original.password);

		System.out.println("[변경] 패스워드:54321");
		cloned.password = "54321";

		System.out.printf("[복제] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[원본] (%s), (%s)\n", original.name, original.password);
	}

}

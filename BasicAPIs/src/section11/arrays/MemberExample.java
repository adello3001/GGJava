package section11.arrays;

import java.util.Arrays;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("È«±æµ¿");
		Member m2 = new Member("±èÈ«µµ");
		Member m3 = new Member("ÀÌ¼ø½Å");
		Member m4 = new Member("¹ÚÁö¿ø");
		
		Member[] members = { m1, m2, m3, m4 };
		Arrays.sort(members);
		
		for(int i = 0; i < members.length; i++) {
			System.out.printf("Members[%d]=%s\n", i, members[i].name);
		}
	}
}

package section03.cloneobject;

public class MemberExample3 {

	public static void main(String[] args) {
		int x = 10;
		int y = x;
		System.out.printf("[원본] x(%d)\n", x);
		System.out.printf("[복제] y(%d)\n", y);
		
		y = 20;

		System.out.printf("[원본] x(%d)\n", x);
		System.out.printf("[복제] y(%d)\n", y);
	}

}

package section03.cloneobject;

public class MemberExample4 {

	public static void main(String[] args) {
		// hello1();
		hello2();
	}

	public static void hello2() {
		String s1 = new String("hello");
		String s2 = s1;
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		
		s2 = "world";
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
	}

	public static void hello1() {
		String s1 = "hello";
		String s2 = s1;
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		
		s2 = "world";
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
	}

}

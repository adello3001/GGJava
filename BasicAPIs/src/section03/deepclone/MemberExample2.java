package section03.deepclone;

public class MemberExample2 {

	public static void main(String[] args) {
		Member2 org = new Member2("java", 30, new int[] {90,100}, new Car("Sonata"));
		Member2 clo = org.getMember();

		System.out.println("[Member2 Test]");
		
		System.out.println("[원본]");
		System.out.println("> name:" + org.name);
		System.out.println(">  car:" + org.car.model);
		for(int x : org.scores) {
			System.out.println("> scores:" + x);
		}
		
		clo.name = "Corba";
		clo.scores[0] = 70;
		clo.scores[1] = 80;
		clo.car.model = "그랜저";
		
		System.out.println("[복제]");
		System.out.println("> name:" + clo.name);
		System.out.println(">  car:" + clo.car.model);
		for(int x : clo.scores) {
			System.out.println("> scores:" + x);
		}
		

		System.out.println("[원본]");
		System.out.println("> name:" + org.name);
		System.out.println(">  car:" + org.car.model);
		for(int x : org.scores) {
			System.out.println("> scores:" + x);
		}

	}

}

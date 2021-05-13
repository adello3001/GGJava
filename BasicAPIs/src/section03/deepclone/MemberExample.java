package section03.deepclone;

public class MemberExample {

	public static void main(String[] args) {
		Member org = new Member("Sonata", 30, new int[] {90,100}, new Car("소나타"));
		Member clo = org.getMember();

		System.out.println("[원본]");
		System.out.println("> name:" + org.name);
		System.out.println(">  car:" + org.car.model);
		for(int x : org.scores) {
			System.out.println("> scores:" + x);
		}
		
		clo.name = "Grandur";
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

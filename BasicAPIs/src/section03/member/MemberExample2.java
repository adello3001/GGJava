package section03.member;

public class MemberExample2 {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2) || obj1.equals(obj3)) {
			if(obj1.equals(obj2)) {
				System.out.println("obj1과 obj2는 같은 값(id)을 가지고 있다.");
			}
			
			if(obj1.equals(obj3)) {
				System.out.println("obj1과 obj3는 같은 값(id)을 가지고 있다.");
			}
		}
		else {
			if(obj1.equals(obj2) != true){
				System.out.println("obj1과 obj2는 같은 값(id)을 가지고 있지 않다.");
			}

			if(obj1.equals(obj3) != true){
				System.out.println("obj1과 obj3는 같은 값(id)을 가지고 있지 않다.");
			}
		}
		
	}
}

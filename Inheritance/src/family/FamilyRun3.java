package family;

public class FamilyRun3 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child3 child = new Child3();

		boolean eq = (parent == child);
		System.out.println("[Parent == Child] : " + (eq));
		System.out.println("[Parent == Child] : " + (parent == child));
		
		
		System.out.println("Parent: money=" + parent.money);
		System.out.println("Child: money=" + child.money);
		

		parent.print("부모");
		// parent.addStock(100); // 부모는 자식의 필드 및 메소드에 접근할 수 없다.
		
		child.addStock(200);
		child.print("자녀");
	}

}

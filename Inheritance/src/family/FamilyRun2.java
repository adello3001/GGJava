package family;

public class FamilyRun2 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child2 child2 = new Child2();

		boolean eq = (parent == child2);
		System.out.println("[Parent == Child] : " + (eq));
		System.out.println("[Parent == Child] : " + (parent == child2));
		
		
		System.out.println("Parent: money=" + parent.money);
		System.out.println("Child: money=" + child2.money);
		

		parent.print("ºÎ¸ð");
		child2.print("ÀÚ³à");
	}

}

/*
 * 클래스 정보(메타클래스)
 * Class
 * - 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보
 */
package section06.classes;

public class ClassExample2 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("section06.classes.Car");
			// Class clazz = Class.forName("Car");
			
			System.out.println("class name: " + clazz.getName());
			System.out.println("class simplename: " + clazz.getSimpleName());
			
			System.out.println("class packagename: " + clazz.getPackage().getName());
			
			Package pack = clazz.getPackage();
			System.out.println("class packagename: " + pack.getName());
			System.out.println("class hashCode: " + pack.hashCode());
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

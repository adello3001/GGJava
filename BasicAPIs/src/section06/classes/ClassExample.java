/*
 * 클래스 정보(메타클래스)
 * Class
 * - 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보
 */
package section06.classes;

public class ClassExample {

	public static void main(String[] args) {
		Car car = new Car();
		Class clazz = car.getClass();
		
		System.out.println("class name: " + clazz.getName());
		System.out.println("class simplename: " + clazz.getSimpleName());
		
		System.out.println("class packagename: " + clazz.getPackage().getName());
		
		Package pack = clazz.getPackage();
		System.out.println("class packagename: " + pack.getName());
		System.out.println("class hashCode: " + pack.hashCode());
	}

}

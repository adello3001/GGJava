/*
 * 클래스 정보(메타클래스)
 * Class
 * - 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보
 */
package section06.classes;

public class ClassExample4 {

	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("section06.classes.Car");
			Object obj = clazz.newInstance();
			
			Car car = (Car)obj;
			car.setCarWidth(100);
			car.setCarName("Tesla");
			System.out.println("Car name:" + car.getCarName());
			System.out.println(obj);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}
	}

}

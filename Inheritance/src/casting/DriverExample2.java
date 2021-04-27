package casting;

public class DriverExample2 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run();
		
		// 부모 객체의 구현체가 자신이 아니면
		// 강제로 캐스팅은 되지만 실행 오류가 발생
		Bus bus = (Bus)vehicle;
		bus.run();
	}
}

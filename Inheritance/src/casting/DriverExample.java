package casting;

public class DriverExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		// 부모 객체를 자식 객체로 대입이 되지 않음
		// Bus bus = vehicle;
		
		// 강제로 캐스팅을 해야 함
		// 단. 부모 객체의 구현체는 캐스팅 되는 자신이어야 한다.
		Bus bus = (Bus)vehicle;
		bus.run();
	}
}

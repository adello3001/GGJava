package section03;

public class ProductExample {

	public static void main(String[] args) {
		Product<Car, String> pcar = new Product<>();
		pcar.setKind(new Car("½Â¿ëÂ÷"));
		pcar.setModel("QM6");
		
		Car car = pcar.getKind();
		String carModel = pcar.getModel();
		System.out.printf("Car(%s)(%s)\n", car.name, carModel);
	}
}

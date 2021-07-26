package instancememberclass;

public class ProductExample2 {

	public static void main(String[] args) {
		Product product = new Product("´º¸ð");
		
		Product.Tv tv = product.new Tv();
		Product.Radio radio = product.new Radio();
		
		Product.Smartphone smartphone = product.new Smartphone();
		smartphone.sale(10);
	}

}

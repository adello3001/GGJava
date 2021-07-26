package instancememberclass;

public class ProductExample {

	public static void main(String[] args) {
		Product product = new Product();
		
		Product.Tv tv = product.new Tv();
		Product.Radio radio = product.new Radio();
		Product.Smartphone smartphone = product.new Smartphone();
	}

}

package instancememberclass;

public class Product2Example {

	public static void main(String[] args) {
		Product2 product = new Product2("Á¦Ç°1");

		Product2.Tv tv = product.newTv();
		product.makeTv(100);
		System.out.println("Tv:total=" + tv.total());
		
		product.saleTv(50);
		System.out.println("Tv:total=" + tv.total());
	}
}

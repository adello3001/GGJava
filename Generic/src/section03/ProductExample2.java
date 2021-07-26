package section03;

public class ProductExample2 {

	public static void main(String[] args) {
		Product<Tv, String> ptv = new Product<>();
		ptv.setKind(new Tv("OLED"));
		ptv.setModel("smartTV");
		
		Tv tv = ptv.getKind();
		String tvModel = ptv.getModel();
		System.out.printf("Tv(%s)(%s)\n", tv.name, tvModel);
	}
}

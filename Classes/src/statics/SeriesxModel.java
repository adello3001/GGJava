package statics;

public class SeriesxModel {
	static Seriesx static_series = new Seriesx(10);
	
	String pid;
	String model;
	
	SeriesxModel(String pid) {
		this.pid = pid;
	}
	
	String makeProduct() {
		this.model = static_series.makeModel(this.pid);
		return this.model;
	}
	
	void printProduct() {
		System.out.printf("Product: pid(%s), model(%s)\n", this.pid, this.model);
	}

	public static void main(String[] args) {
		SeriesxModel sm1 = new SeriesxModel("SM1");
		sm1.makeProduct();
		sm1.printProduct();
		
		sm1.makeProduct();
		sm1.printProduct();
		
		SeriesxModel sm2 = new SeriesxModel("SM2");
		sm2.makeProduct();
		sm2.printProduct();
		
		sm2.makeProduct();
		sm2.printProduct();
	}
}

package statics;

public class SeriesxModel1 {
	static Seriesx static_series = new Seriesx(10);
	static Seriesx static_series2 = new Seriesx(5);
	
	String pid;
	String model;
	String model2;
	
	SeriesxModel1(String pid) {
		this.pid = pid;
	}
	
	void makeProduct() {
		this.model = static_series.makeModel(this.pid);
		this.model2 = static_series2.makeModel(this.pid);
	}
	
	void printProduct() {
		System.out.printf("Product: pid(%s), model(%s)\n", this.pid, this.model);
		System.out.printf("Product: pid(%s), model2(%s)\n", this.pid, this.model2);
	}

	public static void main(String[] args) {
		SeriesxModel1 sm1 = new SeriesxModel1("SM1");
		sm1.makeProduct();
		sm1.printProduct();
		
		SeriesxModel1 sm2 = new SeriesxModel1("SM2");
		sm2.makeProduct();
		sm2.printProduct();
	}
}

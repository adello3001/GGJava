package statics;

public class SerieszModel {
	String pid;
	String model;
	
	SerieszModel(String pid) {
		Seriesz.setCount(10);
		this.pid = pid;
	}
	
	String makeProduct() {
		this.model = Seriesz.makeModel(this.pid);
		return this.model;
	}
	
	void printProduct() {
		System.out.printf("Product: pid(%s), model(%s)\n", this.pid, this.model);
	}

	public static void main(String[] args) {
		SerieszModel sm1 = new SerieszModel("SM1");
		sm1.makeProduct();
		sm1.printProduct();
		
		sm1.makeProduct();
		sm1.printProduct();
		
		SerieszModel sm2 = new SerieszModel("SM2");
		sm2.makeProduct();
		sm2.printProduct();
		
		sm2.makeProduct();
		sm2.printProduct();
	}
}

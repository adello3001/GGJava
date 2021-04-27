package statics;

public class Calculator4 {
	static int static_count = 0;
	int value = 0;

	Calculator4() {
		this.value++;
		Calculator4.static_count++;
	}
	
	void print() {
		System.out.printf("value(%d), static_count(%d)\n", this.value, Calculator4.static_count);
	}
	
	public static void main(String[] args) {
		Calculator4 calc1 = new Calculator4();
		calc1.print();
		
		Calculator4 calc2 = new Calculator4();
		calc2.print();

		Calculator4 calc3 = new Calculator4();
		calc3.print();

		Calculator4 calc4 = new Calculator4();
		calc4.print();
	}
}

package instancememberclass;

public class Product2 {
	String pid = "P1";
	int total;
	
	Tv tv;
	
	Product2() {
		System.out.println("[Product]");
	}
	
	Product2(String pid) {
		this.pid = pid;
	}
	
	Tv tv() {
		return this.tv;
	}
	
	Tv newTv() {
		this.tv = new Tv();
		return this.tv;
	}
	
	int makeTv(int count) {
		this.total += count;
		System.out.println("[makeTv] count=" + count + "/" + this.total);
		return tv.make(count);
	}

	int saleTv(int count) {
		this.total -= count;
		System.out.println("[saleTv] count=" + count + "/" + this.total);
		return tv.sale(count);
	}

	class Tv {
		private int total;
		
		Tv() {
			System.out.println(pid + ":" + "Tv");
		}
		
		int make(int count) {
			this.total += count;
			return this.total;
		}
		
		int sale(int count) {
			this.total -= count;
			return this.total;
		}
		
		int total() {
			return this.total;
		}
	}
	
}

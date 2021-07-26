package instancememberclass;

public class Product {
	String pid = "P1";
	int count;
	
	Product() {
		System.out.println("[Product]");
	}
	
	Product(String pid) {
		this.pid = pid;
	}
	
	void makeProduct(String pname, int count) {
		this.count += count;
		System.out.println("[makeProduct] pname=" + pname + ", count=" + count + "/" + this.count);
	}
	
	int saleProduct(String pname, int count) {
		this.count -= count;
		System.out.println("[saleProduct] pname=" + pname + ", count=" + count + "/" + this.count);
		return this.count;
	}
	
	class Tv {
		Tv() {
			System.out.println(pid + ":" + "Tv");
			makeProduct("Tv", 10);
		}
		
		int sale(int count) {
			return saleProduct("Tv", count);
		}
	}
	
	class Radio {
		Radio() {
			System.out.println(pid + ":" + "Radio");
			makeProduct("Radio", 1);
		}
		
		int sale(int count) {
			return saleProduct("Radio", count);
		}
	}
	
	class Smartphone {
		Smartphone() {
			System.out.println(pid + ":" + "Smartphone");
			makeProduct("Smartphone", 100);
		}
		
		int sale(int count) {
			return saleProduct("Smartphone", count);
		}
	}
}

package statics;

public class Series {
	static int series = 0;
	String pid;
	String model;
	
	Series(String pid) {
		this.pid = pid;
	}
	
	static int getSeries() {
		return ++Series.series; 
	}
	
	String getPid() {
		return this.pid;
	}
	
	String makeModel() {
		String str = String.valueOf(Series.getSeries());
		model = pid + "-" + str;
		return model;
	}

	public static void main(String[] args) {
		Series s1 = new Series("EZEN");
		System.out.printf("[%s]: model[%s]\n", s1.getPid(), s1.makeModel());
		
		Series s2 = new Series("EZEN2");
		System.out.printf("[%s]: model[%s]\n", s2.getPid(), s2.makeModel());
	}
}

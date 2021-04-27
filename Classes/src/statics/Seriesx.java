package statics;

public class Seriesx {
	int series = 0;
	int count = 1;
	
	Seriesx(int count) {
		this.count = count;
	}
	
	int getSeries() {
		series += count;
		return series; 
	}

	String makeModel(String pid) {
		String str = String.valueOf(getSeries());
		String model = pid + "-S-" + str;
		return model;
	}
}

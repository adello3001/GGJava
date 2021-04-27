package statics;

public class Seriesz {
	static int series = 0;
	static int count = 1;
	
	static void setCount(int count) {
		Seriesz.count = count;
	}
	
	static String makeModel(String pid) {
		Seriesz.series += Seriesz.count;
		String str = String.valueOf(Seriesz.series);
		String model = pid + "-S-" + str;
		return model;
	}
}

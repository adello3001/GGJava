/*
 * 싱글톤(Singleton)
 *   - 유일한 하나의 객체만 생성된다.
 */
package statics;

public class Seriesx2 {
	static Seriesx2 static_series = new Seriesx2(1);
	int series = 0;
	int count = 1;

	// 이 메소드를 호출하게 되면 이미 만들어진 static_series를 리턴하여
	// 유일한 하나만 사용하도록 제한하여
	static Seriesx2 getInstance(int count) {
		// Seriesx2 series = Seriesx2.static_series;
		// series.setCount(count);
		Seriesx2.static_series.setCount(count);
		
		return Seriesx2.static_series;
	}

	//-----------------------------------------------
	// private은 외부에서 new를 할 수 없음
	//-----------------------------------------------
	private Seriesx2(int count) {
		this.count = count;
	}
	//-----------------------------------------------
	
	void setCount(int count) {
		Seriesx2.static_series.count = count;
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

package section06.classes;

public class Car {
	int width;
	String s;
	
	Car() {}
	Car(int width) {
		this.width = width;
	}
	
	Car(int wdith, String s) {
		this.width = width;
		this.s = s;
	}

	String getCarName() {
		return this.s;
	}
	
	void setCarName(String s) {
		this.s = s;
	}
	
	void setCarWidth(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return String.format("Car: width(%d), s(%s)\n", this.width, this.s);
	}
}

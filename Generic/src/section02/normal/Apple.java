package section02.normal;

public class Apple {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return this.object;
	}	
	@Override
	public String toString() {
		return "Apple";
	}
}

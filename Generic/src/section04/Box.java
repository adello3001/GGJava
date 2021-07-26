package section04;

public class Box<T> {
	private T name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return this.name;
	}
}

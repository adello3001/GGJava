package section02.generic;

/*
 * 이미 존재하는 타입을 제너릭에서 쓰는 것은 지양
 */
public class Container<String> {
	private String str;
	
	public String get() {
		return this.str;
	}
	
	public void set(String str) {
		this.str = str;
	}

}

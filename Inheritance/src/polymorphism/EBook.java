package polymorphism;

public class EBook extends Book {
	private String title;
	
	public EBook() {}

	public EBook(String name, String category, String author, double price) {
		super(name, category, author, price);  // 부모생성자 호출
	}

	public EBook(String name, String category, String author, double price, String title) {
		super(name, category, author, price);  // 부모생성자 호출
		this.setTitle(title);
	}

	void setTitle(String title) {
		this.title = "CD-" + title;
	}
	
	String getTitle() {
		return title;
	}
	
	public String toString() {
		String str = String.format("[EBook] 이름(%s), 분류(%s), 저자(%s), 가격(%f), 타이틀(%s)\n",
				name, category, author, price, title);
		
		return str;
	}
	
}

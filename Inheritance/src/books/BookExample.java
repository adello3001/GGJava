package books;

public class BookExample {

	public static void main(String[] args) {
		Book book = new Book("진달래 꽃", "시집", "김소월", 20.5);

		System.out.print("[시집]");
		System.out.println("name: " + book.name);
		System.out.println("catetory: " + book.category);
		System.out.println("author: " + book.author);
		System.out.println("price: " + book.price);
		
		System.out.println("-----------------------------------------------");
		System.out.println(book);
	}

}

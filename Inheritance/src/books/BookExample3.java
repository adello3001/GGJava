package books;

public class BookExample3 {
	
	public String toString() {
		return String.format("[BookExample3] 나는 객체를 스트링으로 변환합니다.");
	}

	public static void main(String[] args) {
		BookExample3 book = new BookExample3();
		System.out.println(book);
		System.out.println(book.toString());
	}

}

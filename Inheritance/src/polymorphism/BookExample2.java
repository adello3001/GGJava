/*
 * 1. 부모의 타입으로 자식객체가 자동 타입 변환
 * 2. 부모의 객체를 자식 타입으로 받을 수 없다.
 */
package polymorphism;

public class BookExample2 {

	public static void main(String[] args) {
		Book book = new Book("홍길동전", "고전", "허균", 0.0); 
		
		// [오류]
		// 부모의 객체를 자식 타입으로 받을 수 없다.
		// EBook xbook = new Book("고전", "문화유산", "선조", 0.0);
		// EBook xbook = book;
		// EBook xbook = (EBook)book;

		Book ebook = new EBook("진달래 꽃", 
				"시집", 
				"김소월", 
				20.5, 
				"전자책");
		
		Book novel = new Novel("태백산맥", 
				"소설", 
				"조정래", 
				20.5, 
				"해방 이후의 이념과 민중의 한");

		System.out.println(book);
		System.out.println(ebook);
		System.out.println(novel);
	}

}

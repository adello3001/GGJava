/*
 * 1. 부모의 타입으로 자식객체가 자동 타입 변환
 */
package polymorphism;

public class BookExample {

	public static void main(String[] args) {
		EBook ebook = new EBook("진달래 꽃", "시집", "김소월", 20.5, "전자책");
		Novel novel = new Novel("태백산맥", "소설", "조정래", 20.5, "해방 이후의 이념과 민중의 한");

		System.out.println(ebook);
		System.out.println(novel);
	}

}

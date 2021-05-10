package remocon;

public class SearcherFinder2Example {

	public static void main(String[] args) {
		SearcherFinder2 sf = new SearcherFinder2();
		sf.find("검색문자");
		sf.search("인터넷주소");
		
		Searchable2 s2 = sf;
		s2.search("인터넷주소2");
		// s2.find("검색문자2");
		
		Finder finder = sf;
		finder.find("검색문자2");
		// finder.search("인터넷주소2");
		
		/*
		 * 구현객체를 인터페이스 변수로 받을 때 인터페이스의 정의형으로 한정된다.
		 * 예) 실수형 -> 정수형
		 *   프리미티브 타입의 경우와 유사하다.
		 *   실수를 정수로 받으면 실수의 내용이 정수형으로 변환되는 것과 같다.
		 */
		int x = (int)3.14f;
		System.out.println("x=" + x);
	}
}

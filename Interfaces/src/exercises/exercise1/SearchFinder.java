/*
 * 추상 메소드인 lookup을 구현하지 않으면 추상 클래스로 만들어야 한다.
 * 그러므로 abstract class로 선언해야 한다. 
 */
package exercises.exercise1;

public abstract class SearchFinder implements SearchFindable {
	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:find(%s)\n", text);
	}

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%s)\n", url);
	}

	/*
	@Override
	public void lookup(String topic) {
	}
	*/
	
	// 추상 메소드인 lookup을 명시적으로 기술할 수 있다.
	// 기술하지 않아도 된다.
	// 그러나 구현 클래스에서는 구현을 해야 한다.
	public abstract void lookup(String topic);
}

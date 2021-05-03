package exercises.exercise01;

public class SearchFinderExample {

	public static void main(String[] args) {
		SearchFindable sf = new SearchFinderImpl();
		SearchFindable.info(sf);
		
		/*
		 * SearchFinder는 추상 클래스
		 * SearchFinder.lookup()이 구현 되어 있지 않음
		 */
		/*
		 SearchFindable ff = new SearchFinder();
		 SearchFindable.info(ff);
		 */
	}

}

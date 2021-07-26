package remocon;

public class SearcherFinder implements Searchable {
	public static void main(String args[]) {
		SearcherFinder search = new SearcherFinder();
		search.search("https://naver.com");
		search.find("인터페이스");
	}

	@Override
	public void search(String url) {
		System.out.printf("SearcherFinder:search(%s)\n", url);
	}

	@Override
	public void find(String text) {
		System.out.printf("SearcherFinder:find(%s)\n", text);
	}
}

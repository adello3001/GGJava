package remocon;

public class Searcher implements Searchable {

	@Override
	public void search(String url) {
		System.out.printf("Searcher:search(%s)\n", url);
	}
	
	public static void main(String args[]) {
		Searcher search = new Searcher();
		search.search("https://naver.com");
	}
}

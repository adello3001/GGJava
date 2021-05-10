package remocon;

public class SearcherFinder2 implements Searchable2, Finder {

	@Override
	public void find(String text) {
		System.out.printf("SearchFinder2:find(%s)\n",  text);
	}

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder2:search(%s)\n", url);
	}
}

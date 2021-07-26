package inherits;

public class SearchFinder2 implements Searchable, Findable {

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%s)\n", url);
	}

	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:find(%s)\n", text);
	}

}

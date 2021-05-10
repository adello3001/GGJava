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

	public abstract void lookup(String topic);
}

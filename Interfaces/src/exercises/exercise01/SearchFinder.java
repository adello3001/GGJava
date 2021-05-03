package exercises.exercise01;

public abstract class SearchFinder implements SearchFindable {
	
	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:find(%s)", text);
	}

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%s)", url);
	}

	public abstract void lookup(String topic);
}

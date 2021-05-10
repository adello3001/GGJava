package inherits;

public class BlobSearchFinder implements SearchFindable {
	@Override
	public void search(String url) {
		System.out.printf("BlobSearchFinder:search(%s)\n", url);
	}

	@Override
	public void find(String text) {
		System.out.printf("BlobSearchFinder:find(%s)\n", text);
	}
}

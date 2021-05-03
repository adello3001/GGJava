package exercises.exercise01;

public interface SearchFindable {
	void find(String text);
	void search(String url);
	void lookup(String topic);
	
	public static void info(SearchFindable sf) {
		sf.search("Ž��");
		sf.find("ã��");
		sf.lookup("�˻�");
	}
}

package remocon;

public interface Searchable {
	void search(String url);
	default void find(String text) {}
}

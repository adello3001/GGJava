package section03.hashcode;

import java.util.HashMap;

public class KeyExample2 {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		Key hkey = new Key(100, 32);
		hashMap.put(hkey, "ȫ�浿");
		
		String value = hashMap.get(hkey);
		System.out.println(value);

	}

}

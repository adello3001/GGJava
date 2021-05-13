package section03.hashcode;

import java.util.HashMap;

public class KeyExample3 {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		// hashMap.put("100", "ȫ�浿");
		hashMap.put(new String("100"), "ȫ�浿");
		
		String value = hashMap.get(new String("100"));
		System.out.println("100=" + value);
		
		String value2 = hashMap.get(new String("100"));
		System.out.println("100=" + value2);
	}

}

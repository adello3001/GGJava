package section03.hashcode;

import java.util.HashMap;

public class KeyExample4 {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// hashMap.put("100", "ȫ�浿");
		// hashMap.put(100, "ȫ�浿");
		hashMap.put(new Integer(100), "ȫ�浿");
		
		String value = hashMap.get(100);
		System.out.println("100=" + value);
		
		String value2 = hashMap.get(new Integer(100));
		System.out.println("100=" + value2);
	}

}

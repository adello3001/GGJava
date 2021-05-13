package section03.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(100, 32), "홍길동");
		hashMap.put(new Key(200, 33), "이순신");
		hashMap.put(new Key(200, 33), "전우치"); // 이순신이 전우치로 바뀜
		
		
		String value = hashMap.get(new Key(100, 32));
		System.out.println(value);
		
		String value2 = hashMap.get(new Key(200, 33));
		System.out.println(value2);


	}

}

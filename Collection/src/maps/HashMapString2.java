/*
 * [map]
 * 키와 값으로 구성, 딕셔너리(dictionary)
 *   - 키는 중복을 허용하지 않음
 *   - 값은 중복을 허용
 *   - 중복되는 키로 값을 넣으면 새로운 값으로 바뀜
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapString2 {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		maps.put("자바", 20);
		maps.put("파이썬", 15);
		maps.put("자바스크립트", 25);
		
		// 새로운 값으로 바뀜
		maps.put("자바", 23);
		
		printMap(maps);
		
		// 키로 삭제
		System.out.println("[삭제]");
		maps.remove("파이썬");
		printMap(maps);
		
		// 모든 데이터를 삭제
		System.out.println("[전체삭제]");
		maps.clear();
		printMap(maps);
	}
	
	static void printMap(Map<String, Integer> maps) {
		System.out.println("maps.size : " + maps.size());
		
		Set<String> keySet = maps.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = maps.get(key);
			System.out.printf("key(%s), value(%d)%n", key, value);
		}
	}

}

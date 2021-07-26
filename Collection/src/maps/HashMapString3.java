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

public class HashMapString3 {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<String, Integer>();
		
		maps.put("자바", 20);
		maps.put("파이썬", 15);
		maps.put("자바스크립트", 25);
		
		printMap(maps);
	}
	
	static void printMap(Map<String, Integer> maps) {
		System.out.println("maps.size : " + maps.size());
		
		Set<Map.Entry<String, Integer>> entrySet = maps.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("key(%s), value(%d)%n", key, value);
		}
	}

}

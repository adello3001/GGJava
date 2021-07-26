/*
 * [set]
 * 1. 중복해서 들어 가지 않음
 * 2. 순서가 무작위
 * 3. 저장된 순서가 보장되지 않는다.
 */
package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add("자바");
		setString.add("자바스크립트");
		setString.add("파이썬");
		
		printSet(setString);
		
		// 자료 삭제
		setString.remove("파이썬");
		printSet(setString);
		
		// 모든 자료 삭제
		setString.clear();
		printSet(setString);
	}
	
	static void printSet(Set<String> sets) {
		boolean isEmpty = sets.isEmpty();
		System.out.println("Is sets empty?: " + isEmpty);
		
		int size = sets.size();
		System.out.println("setString.size : " + size);
		for(String str : sets) {
			System.out.println(str);
		}
	}

}

/*
 * [set]
 * 1. �ߺ��ؼ� ��� ���� ����
 * 2. ������ ������
 * 3. ����� ������ ������� �ʴ´�.
 */
package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add("�ڹ�");
		setString.add("�ڹٽ�ũ��Ʈ");
		setString.add("���̽�");
		
		printSet(setString);
		
		// �ڷ� ����
		setString.remove("���̽�");
		printSet(setString);
		
		// ��� �ڷ� ����
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

/*
 * [set]
 * 1. �ߺ��ؼ� ��� ���� ����
 * 2. ������ ������
 * 3. ����� ������ ������� �ʴ´�.
 */
package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample4 {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		
		setString.add(new String("�ڹ�"));
		setString.add(new String("�ڹ�"));
		
		printSet(setString);
	}
	
	static void printSet(Set<String> sets) {
		System.out.println("setString.size : " + sets.size());

		Iterator<String> iterator = sets.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}

}
package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric {

	public static void main(String[] args) {
		normalList();
		genericList();
	}
	
	static void normalList() { // 일반적인 타입
		System.out.println(">>> normalList() <<<");
		List list = new ArrayList();
		list.add("hello");
		list.add(100);
		String str = (String)list.get(0);
		// String str = list.get(0);
		System.out.println("String:" +str);
		
		int x = (int)list.get(1);
		System.out.println("int:" + x);
	}

	static void genericList() { // 제너릭 타입
		System.out.println(">>> genericList() <<<");
		
		// 선언할 때 타입을 결정
		List<String> list = new ArrayList<String>();
		list.add("hello");
		String str = list.get(0);
		System.out.println("String:" +str);
		
		// 다양한 타입으로 사용할 수 없다.
		// list.add(100);
	}
}

package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric {

	public static void main(String[] args) {
		normalList();
	}
	
	static void normalList() { // 일반적인 타입
		System.out.println(">>> normalList() <<<");
		List list = new ArrayList();
		list.add("hello");
		list.add(100);
		// String str = (String)list.get(0);
		Object obj = list.get(0);
		String str = (String)obj;
		
		System.out.println("String:" + str);
		
		int x = (int)list.get(1);
		System.out.println("int:" + x);
	}
}

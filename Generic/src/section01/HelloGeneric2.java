package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric2 {

	public static void main(String[] args) {
		genericList();
	}
	
	static void genericList() { // 제너릭 타입
		System.out.println(">>> genericList() <<<");
		
		// 선언할 때 타입을 결정
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		
		String hello = list.get(0);
		String world = list.get(1);
		System.out.println("String:" + hello + ", " + world);
		
		// 다양한 타입으로 사용할 수 없다.
		// list.add(100);
	}
}

package section01;

import java.util.ArrayList;
import java.util.List;

public class HelloGeneric3 {

	public static void main(String[] args) {
		genericList();
	}
	
	static void genericList() { // 제너릭 타입
		System.out.println(">>> genericList() <<<");
		
		// 선언할 때 타입을 결정
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		int x1 = list.get(0);
		int x2 = list.get(1);
		System.out.println("Integer:" + x1 + ", " + x2);
	}
}

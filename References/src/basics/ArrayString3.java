package basics;
/*
 * 배열(String)
 */
public class ArrayString3 {

	public static void main(String[] args) {
			String[] str =  null;
			
			if(str == null) {
				str = new String[]{ "홍길동", "이순신", "강감찬", "마지막 데이터" };
			}
			
			System.out.println("str length:" + str.length);
			
			for(String name : str) {
				System.out.printf("[%s]\n", name);
			}
	}
}

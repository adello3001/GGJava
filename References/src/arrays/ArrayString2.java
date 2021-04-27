package arrays;
/*
 * 배열(String)
 */
public class ArrayString2 {

	public static void main(String[] args) {
			String[] str =  null;
			
			if(str == null) {
				str = new String[]{ "홍길동", "이순신", "강감찬", "마지막 데이터" };
			}
			
			System.out.println("str length:" + str.length);
			
			for(int cnt=0; cnt < str.length; cnt++) {
				System.out.printf("[%d][%s]\n", cnt, str[cnt]);
			}
	}
}

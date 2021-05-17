/*
 * 스트링 생성 처리
 * - StringBuffer : 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용된 클래스
 * - StringBuilder : 단일 스레드 환경에서 사용할 수 있는 클래스
 * - String : 저장된 문자열을 수정할 수 없다.
 */
package section08.strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// testString();
		// addString();
		stringBuilder();
	}
	
	static void stringBuilder() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb);
		
		sb.insert(4, "8");
		System.out.println(sb);
		
		sb.setCharAt(4, '7');
		System.out.println(sb);
		
		sb.replace(6, 13, "Book");
		System.out.println(sb);
		
		sb.delete(4,5);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("length=" + length);
		
		String result = sb.toString();
		System.out.println(result);
		
		int pos = sb.indexOf("Study");
		System.out.println("Study pos=" + pos);
		
		int pox = sb.indexOf("Boox");
		System.out.println("Boox pox=" + pox);
	}
	

	/*
	 * String은 문자열을 수정할 수 없다.
	 */
	static void testString() {
		String str = "hello,안녕!";
		
		System.out.println(str);
		
		// str[0] = 'x';
		// char ch = str[0];
		
		for(int cnt=0; cnt < str.length(); cnt++) {
			char ch = str.charAt(cnt);
			System.out.printf("str[%d]=%c\n",  cnt, ch);
		}
	}
	
	static void addString() {
		String str = null;
		
		str = "hello";
		str += ",";
		str += "안녕";
		str += "!";
		System.out.println("addString: " + str);
	}

}

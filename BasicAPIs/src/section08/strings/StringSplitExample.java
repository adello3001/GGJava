/*
 * 문자열 분리, 추출
 * 정규표현식: 
 */
package section08.strings;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김지미-최명호/전우치";
		
		String[] names = text.split("&|,|-|/");
		
		System.out.println("names.length=" + names.length);
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}

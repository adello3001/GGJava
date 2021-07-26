/*
 * 
 */
package section05.s04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample2 {
	public static void main(String[] args) throws Exception {		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);	
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력: ");
		String lineString = br.readLine(); // CRLF로 구분된 행 단위의 문자열을 한꺼번에 읽을 수 있다.
		
		System.out.println("출력: " + lineString);	
	}
}
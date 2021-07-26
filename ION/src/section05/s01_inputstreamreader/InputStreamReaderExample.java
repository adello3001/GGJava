/*
 * [보조 스트림]
 *   - 필터(filter)
 *   - 자체적으로 입출력을 수행 하는 기능이 없다.
 *   - 입출력 기능을 가진 스트림과 연결해서 사용
 */
package section05.s01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);	
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}


/*
 * Reader.read()
 *   - 문자(char)단위로 읽는다.
 *   - 2바이트를 읽는다.
 *   - 읽은 내용은 int로 리턴
 */
package section02.s03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/Temp/wise.txt");

		while(true) {
			int readData = reader.read();
			if(readData == -1) {
				break;
			}
			System.out.print((char)readData);
		}
		
		reader.close();
	
	}

}

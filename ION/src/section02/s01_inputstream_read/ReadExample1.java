package section02.s01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test.txt");

		while(true) {
			int readByte = is.read();
			if(readByte == -1) {
				break;
			}
			System.out.print((char)readByte);
		}
		
		is.close();
	}
}

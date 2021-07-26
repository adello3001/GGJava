package section02.s01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test.txt");
		byte[] readBytes = new byte[8];
		int readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.printf("readBytes: [%d][%c]\n", i, (char)readBytes[i]);
		}
		is.close();
	}

}

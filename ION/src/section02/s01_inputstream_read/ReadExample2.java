package section02.s01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// InputStream is = new FileInputStream("D:/Temp/test.txt");
		InputStream is = new FileInputStream("D:\\Temp\\test.txt");
		
		byte[] readBytes = new byte[3];
		String data = "";

		while( true ) {
			int readByteNo = is.read(readBytes);
			if(readByteNo == -1) {
				break;
			}
			
			String read = new String(readBytes, 0, readByteNo);
			System.out.printf("readByteNo[%d][%s]\n", readByteNo, read);
			
			data += read;
		}
		
		System.out.println(data);
		is.close();
	}
}

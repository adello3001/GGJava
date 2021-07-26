package section02.s03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/Temp/test-in.txt");
		char[] cbuf = new char[4];
		int readCharNo = reader.read(cbuf, 1, 2);
		for(int i=0; i<cbuf.length; i++) {
			System.out.printf("[%d][%c]\n", i, cbuf[i]);
		}
		reader.close();
	
	}

}

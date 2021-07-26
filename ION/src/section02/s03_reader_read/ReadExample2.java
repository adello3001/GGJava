package section02.s03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/Temp/test.txt");
		char[] cbuf = new char[2];
		String data = "";
		while( true ) {
			int readCharNo = reader.read(cbuf);
			if(readCharNo == -1) {
				break;
			}
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
	
	}

}

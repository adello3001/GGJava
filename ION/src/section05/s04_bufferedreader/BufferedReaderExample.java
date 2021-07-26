package section05.s04_bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {		
		Reader reader = new FileReader("D:/Temp/wise.txt"); 	
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String lineString = br.readLine(); // CRLF 단위로 읽음(CRLF는 자름)
			if(lineString == null) {
				break;
			}
			System.out.println(lineString);
		}
	}
}
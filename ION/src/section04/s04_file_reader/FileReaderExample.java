package section04.s04_file_reader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:/Temp/wise.txt");
		
		int readCharNo;
		char[] cbuf = new char[100];
		
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String str = new String(cbuf, 0, readCharNo);
			System.out.print(str);
		}
		fr.close();
	}
}


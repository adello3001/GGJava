package section02.s04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Temp/test-wr-str.txt");
		
		String data = "안녕 자바 프로그램";
		//writer.write(data);
		writer.write(data, 3, 2);
		
		writer.flush();
		writer.close();
	}

}

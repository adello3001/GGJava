package section02.s04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Temp/test-wr.txt");
		char[] data = "ȫ�浿".toCharArray();
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}

}

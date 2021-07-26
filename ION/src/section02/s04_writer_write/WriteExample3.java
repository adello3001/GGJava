package section02.s04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Temp/test-wrof.txt");
		char[] data = "ȫ�浿".toCharArray();
		writer.write(data, 1, 2);

		writer.flush();
		writer.close();
	}

}

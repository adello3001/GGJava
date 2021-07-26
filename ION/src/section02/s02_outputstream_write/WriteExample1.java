package section02.s02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:/Temp/test-out.txt");
		
		byte[] data = "Hello, Java!".getBytes();
		
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		
		os.flush();
		os.close();
	}

}

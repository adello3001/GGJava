package section02.s02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("D:/Temp/test-offset.txt");
		byte[] data = "ABCDEFG".getBytes();
		os.write(data, 2, 3); // 배열의 2번째부터 3바이트를 출력
		os.flush();
		os.close();
	}

}

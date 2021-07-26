/*
 * 자바 기본타입(Primitive Type) 입출력
 *    - boolean
 *    - char
 *    - short
 *    - int, long
 *    - float, double
 *    - String
 * 출력된 데이터를 읽을 때는 출력한 동일한 순서로 읽어야 한다.(FIFO)    
 */
package section05.s06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Temp/Java/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(10);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(20);
		
		dos.flush();
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("D:/Temp/Java/primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();
	}
}


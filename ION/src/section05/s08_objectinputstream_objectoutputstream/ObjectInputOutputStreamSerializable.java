/*
 * 객체 입출력 스트림
 * [문제]
 *    - ObjectInputOutputStreamSerializable에 개별적인 값들을 Serializable 인터페이스로 해서 처리 
 */
package section05.s08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectInputOutputStreamSerializable implements Serializable {
	static final String filename = "D:/Temp/Java/object-self.dat";
	Integer field1;
	Double field2;
	int[] field3;
	String field4;
	ClassC classC;

	public static void main(String[] args) throws Exception {
		ObjectInputOutputStreamSerializable obj = new ObjectInputOutputStreamSerializable(
				new Integer(10),
				new Double(3.14),
				new int[] { 10,20,30},
				new String("자바스트림"),
				new ClassC(99)
		);
		
		obj.saveObject();
		obj.loadObject();
	}

	public ObjectInputOutputStreamSerializable(Integer field1, Double field2, int[] field3, String field4, ClassC classC) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.field4 = field4;
		this.classC = classC;
	}
	
	void saveObject() throws Exception {
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		oos.writeObject(this);
		
		oos.flush();
		
		oos.close();
		fos.close();
	}
	
	void loadObject() throws Exception {
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ObjectInputOutputStreamSerializable obj = (ObjectInputOutputStreamSerializable)ois.readObject();
		this.field1 = obj.field1;
		this.field2 = obj.field2;
		this.field3 = obj.field3;
		this.field4 = obj.field4;
		this.classC = obj.classC;
		
		ois.close();
		fis.close();
		
		System.out.println(this.field1);
		System.out.println(this.field2);
		for(int x : this.field3 ) {
			System.out.printf("[%d]", x); 
		}
		System.out.println();
		System.out.println(this.field4);
		System.out.println(this.classC.field1);
	}
}

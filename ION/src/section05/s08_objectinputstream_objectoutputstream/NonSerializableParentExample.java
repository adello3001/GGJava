package section05.s08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Temp/Java/object-child.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		Child child = new Child();
		child.field1 = "홍길동";  // 부모필드
		child.field2 = "홍삼원";  // 자식필드
		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close();	
		
		FileInputStream fis = new FileInputStream("D:/Temp/Java/object-child.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1); // 부모필드
		System.out.println("field2: " + v.field2); // 자식필드
		ois.close(); fis.close();
	}
}

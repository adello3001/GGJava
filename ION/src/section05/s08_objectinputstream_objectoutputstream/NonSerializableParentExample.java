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
		child.field1 = "ȫ�浿";  // �θ��ʵ�
		child.field2 = "ȫ���";  // �ڽ��ʵ�
		oos.writeObject(child);
		oos.flush(); oos.close(); fos.close();	
		
		FileInputStream fis = new FileInputStream("D:/Temp/Java/object-child.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1); // �θ��ʵ�
		System.out.println("field2: " + v.field2); // �ڽ��ʵ�
		ois.close(); fis.close();
	}
}

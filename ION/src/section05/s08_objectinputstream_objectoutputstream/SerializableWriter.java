package section05.s08_objectinputstream_objectoutputstream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	static final String filename = "D:/Temp/Java/object-classa.dat";
	
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		ClassA classA = new ClassA();
		classA.field1 = 10;
		classA.classb.field1 = 20;
		classA.field3 = 30;
		classA.field4 = 40;
		
		oos.writeObject(classA);
		
		oos.flush();
		
		oos.close();
		fos.close();	
		
		System.out.printf("Ŭ����(ClassA)�� ��ü(classA)�� ����(%s)�� �����߽��ϴ�.\n", filename);
	}
}

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
		
		System.out.printf("클래스(ClassA)의 객체(classA)를 파일(%s)에 저장했습니다.\n", filename);
	}
}

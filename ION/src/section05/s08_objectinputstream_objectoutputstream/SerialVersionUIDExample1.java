package section05.s08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Temp/Java/object-classc.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		ClassC classC = new ClassC();
		classC.field1 = 1;
		oos.writeObject(classC);
		oos.flush();
		oos.close();
		fos.close();	
	}
}

/*
 * 1. 부모 클래스(Parent)는 Serializable을 implements하지 않고
 *    자식 클래스(Child)에서 Serializable을 한 경우
 *    부모의 필드는 직렬화가 되지 않고
 *    자식 필드만 질렬화가 된다.
 * 2. private으로 writeObject(), readObject()를 정의
 *    - 부모의 필드를 스트림에 write, read 처리를 하면된다.
 *    - 자기 자신은 defaultReadObject, defaulWriteObject를 하면된다. 
 */
package section05.s08_objectinputstream_objectoutputstream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable {
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
	   out.writeUTF(field1); 		// 부모필드
	   out.defaultWriteObject();	// 자기자신
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
	   field1 = in.readUTF();		// 부모필드
	   in.defaultReadObject();		// 자기자신
	}
}

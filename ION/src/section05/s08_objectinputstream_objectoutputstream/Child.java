/*
 * 1. �θ� Ŭ����(Parent)�� Serializable�� implements���� �ʰ�
 *    �ڽ� Ŭ����(Child)���� Serializable�� �� ���
 *    �θ��� �ʵ�� ����ȭ�� ���� �ʰ�
 *    �ڽ� �ʵ常 ����ȭ�� �ȴ�.
 * 2. private���� writeObject(), readObject()�� ����
 *    - �θ��� �ʵ带 ��Ʈ���� write, read ó���� �ϸ�ȴ�.
 *    - �ڱ� �ڽ��� defaultReadObject, defaulWriteObject�� �ϸ�ȴ�. 
 */
package section05.s08_objectinputstream_objectoutputstream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Child extends Parent implements Serializable {
	public String field2;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
	   out.writeUTF(field1); 		// �θ��ʵ�
	   out.defaultWriteObject();	// �ڱ��ڽ�
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
	   field1 = in.readUTF();		// �θ��ʵ�
	   in.defaultReadObject();		// �ڱ��ڽ�
	}
}

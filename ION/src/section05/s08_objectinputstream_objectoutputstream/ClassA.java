/*
 * ��ü ����ȭ
 *   - ����ȭ���� ����(static)
 *   - ����ȭ���� ����(transient)
 */
package section05.s08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB classb = new ClassB();	
	static int field3;		// ����ȭ���� ����(static)
	transient int field4;	// ����ȭ���� ����(transient)
}

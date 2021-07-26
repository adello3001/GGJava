/*
 * 객체 직렬화
 *   - 직렬화에서 제외(static)
 *   - 직렬화에서 제외(transient)
 */
package section05.s08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB classb = new ClassB();	
	static int field3;		// 직렬화에서 제외(static)
	transient int field4;	// 직렬화에서 제외(transient)
}

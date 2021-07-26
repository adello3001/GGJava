/*
 * serialver.exe�� ����ؼ� serialVersionUID�� �����Ͽ� �����ϸ�
 * Ŭ������ ����Ǿ� �������ϵǾ ����ȭ�� ���� �ȴ�.
 * > serialver.exe section05.s08_objectinputstream_objectoutputstream.ClassC
 */
package section05.s08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassC implements Serializable {
	private static final long serialVersionUID = 1479054838864287128L;
	int field1;
	int field2;
	
	public ClassC() {}
	public ClassC(int field1) {
		this.field1 = field1;
	}
}

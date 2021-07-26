/*
 * serialver.exe를 사용해서 serialVersionUID를 생성하여 지정하면
 * 클래스가 변경되어 재컴파일되어도 직렬화가 유지 된다.
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

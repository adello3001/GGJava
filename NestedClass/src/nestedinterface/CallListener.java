/*
 * Button의 선언되어 있는 중첩인터페이스인 OnClickListener를
 * 사용하여 구현객체 CallListener를 정의
 */
package nestedinterface;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("CallListener.onClick()");
	}

}

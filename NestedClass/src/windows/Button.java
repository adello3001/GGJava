<<<<<<< HEAD
/*
 * [��ø �������̽�]
 * - Ŭ���� �ȿ� �������̽��� ����
 * - Ŭ������ ���ӵ� �������̽��� ����
 */
package windows;

public class Button {
	OnClickListener listener;
	
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
	}
	
	interface OnClickListener {
		void onClick(); 
	}
}
=======
/*
 * [��ø �������̽�]
 * - Ŭ���� �ȿ� �������̽��� ����
 * - Ŭ������ ���ӵ� �������̽��� ����
 */
package windows;

public class Button {
	OnClickListener listener;
	
	/*
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	*/
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
	}
	
	interface OnClickListener { // Listener
		void onClick(); // �̺�Ʈ �ڵ鷯
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

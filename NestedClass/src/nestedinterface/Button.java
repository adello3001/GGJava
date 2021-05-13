<<<<<<< HEAD
/*
 * [중첩 인터페이스]
 * - 클래스 안에 인터페이스를 정의
 * - 클래스에 종속된 인터페이스로 한정
 */
package nestedinterface;

public class Button {
	OnClickListener listener;
	OnTouchListener touchListener;
	
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void setOnTouchListener(OnTouchListener listener) {
		touchListener = listener;
	}
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
		
		if(this.touchListener != null) {
			this.touchListener.onTouch("임무 완료!");
		}
	}
	
	interface OnClickListener {
		void onClick();
	}
}
=======
/*
 * [중첩 인터페이스]
 * - 클래스 안에 인터페이스를 정의
 * - 클래스에 종속된 인터페이스로 한정
 */
package nestedinterface;

public class Button {
	OnClickListener listener;
	OnTouchListener touchListener;
	
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void setOnTouchListener(OnTouchListener listener) {
		touchListener = listener;
	}
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
		
		if(this.touchListener != null) {
			this.touchListener.onTouch("임무 완료");
		}
	}
	
	interface OnClickListener { // Listener
		void onClick(); // 이벤트 핸들러
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

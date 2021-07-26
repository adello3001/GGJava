package windows;

public class Window2 {
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	
	public static void main(String[] args) {
		Window2 win = new Window2();
		win.button1.touch();
		win.button2.touch();
		win.button3.touch();
		
	}
	
	/*
	 * 인스턴스 멤버 클래스
	 */
	class ButtonClickListener implements Button.OnClickListener {
		@Override
		public void onClick() {
			System.out.println("버튼이 클릭되었습니다.");
		}
	}
	
	Window2() {
		button3.setOnClickListener(new ButtonClickListener());
		button1.setOnClickListener(new ButtonClickListener());
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
			
}

<<<<<<< HEAD
package windows;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button3.setOnClickListener(listener);
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
			
}
=======
package windows;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	Button button3 = new Button();
	
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window() {
		button3.setOnClickListener(listener);
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
>>>>>>> 4f543b324a078e53ec73996192f4f791504a3f4d

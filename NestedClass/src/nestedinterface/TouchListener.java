package nestedinterface;

public class TouchListener implements OnTouchListener {

	@Override
	public void onTouch(String msg) {
		System.out.printf("TouchListener.onClick(%s)\n", msg);
	}

}

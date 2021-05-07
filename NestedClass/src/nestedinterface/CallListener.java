package nestedinterface;

// import nestedinterface.Button.OnClickListener;

public class CallListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("CallListener.onClick()");
	}
}

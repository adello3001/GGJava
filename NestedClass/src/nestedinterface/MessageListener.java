package nestedinterface;

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("MessageListener.onClick()");
	}

}

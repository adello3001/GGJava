package section07.s03;

import javafx.beans.property.SimpleStringProperty;

public class Phone {
	private SimpleStringProperty smartPhone;
	private SimpleStringProperty smartImage;

	public Phone(String smartPhone, String image) {
		this.smartPhone = new SimpleStringProperty(smartPhone);
		this.smartImage = new SimpleStringProperty(image);
	}
	
	public String getSmartPhone() {
		System.out.println("Phone: getSmartPhone...");
		return smartPhone.get();
	}
	
	public void setSmartPhone(String smartPhone) {
		this.smartPhone.set(smartPhone);
	}
	
	public String getSmartImage() {
		return smartImage.get();
	}
	
	public void setSmartImage(String image) {
		this.smartImage.set(image);
	}
}

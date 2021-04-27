package phone;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;     // 부모의 속성
		this.color = color;     // 부모의 속성
		this.channel = channel; // 자신의 속성
	}
	
	void turnOnDmb() {
		System.out.println("채널 (" + channel + ")에서 DMB 방송을 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 (" + channel + ")로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료");
	}
}

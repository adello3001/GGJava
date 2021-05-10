package remocon;

public class SmartTV implements RemoteControl {
	private String model = "스마트TV";
	private int channel;
	private int volumn;

	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("채널변경:[%s] channel(%d)\n", this.model, this.channel);
	}

	@Override
	public void turnOn() {
		System.out.printf("[%s] SmartTV 켜기\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] SmartTV 끄기\n", this.model);
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn > RemoteControl.MAX_VALUE) {
			volumn = RemoteControl.MAX_VALUE;
		}
		else if(volumn < RemoteControl.MIN_VALUE) {
			volumn = RemoteControl.MIN_VALUE;
		}
		else {
			this.volumn = volumn;
		}
		
		System.out.println("[" + this.model + "] SmartTV 볼륨 :" + this.volumn);
	}
	

}

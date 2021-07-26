package remocon;

public class Television implements RemoteControl {
	private int volumn;
	private String model = "TV";
	
	Television() {}
	Television(String model) {
		this.model = model;
	}

	@Override
	public void turnOn() {
		System.out.printf("[%s] TV 켜기\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] TV 끄기\n", this.model);
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
		
		System.out.println("[" + this.model + "] TV 볼륨 :" + this.volumn);
	}
	
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		// RemoteControl.super.setMute(mute);
		if(mute) {
			System.out.printf("[%s] 무음모드\n", this.model);
		}
		else {
			System.out.printf("[%s] 무음해제\n", this.model);
		}
	}
}

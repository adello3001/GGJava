package phone;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("DmbCellPhone.channel=" + dmbCellPhone.channel);
		
		// 상속받은 부모의 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("안녕하세요");
		dmbCellPhone.receiveVoice("반갑습니다");

		// 자신의 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(11);
		dmbCellPhone.turnOffDmb();	
		System.out.println("DmbCellPhone.channel=" + dmbCellPhone.channel);
	}

}

package ifstmt;
/*
 * [문제] 출근을 하는데 지갑에 들어 있는 현금에 따라서 교통편을 선택한다.
 * 버스 : 2500원, 택시 : 5000원, 전철 : 1500원,  도보 : 1500원 미만
 * 조건 : 묻는 순서를 전철, 버스, 택시 순으로 묻는다.
 */
public class IfStatement3 {

	public static void main(String[] args) {
		int money = 1000;
		
		if(money < 1500) {
			System.out.println("걸어 간다.");
		}
		else if(money >= 1500 && money < 2500) {
			System.out.println("전철을 탄다");
		}
		else if(money >= 2500 && money < 5000) {
			System.out.println("버스를 탄다");
		}
		else {
			System.out.println("택시를 탄다");
		}
	}
}

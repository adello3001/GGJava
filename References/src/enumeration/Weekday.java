package enumeration;

public class Weekday {

	public static void main(String[] args) {
		Week week = Week.MON;
		
		System.out.println("Week=" + week);
		
		if(week == Week.SUN) {
			System.out.println("오늘은 일요일입니다.");
		}
		else {
			System.out.println("오늘은 평일입니다.");
		}
	}

}

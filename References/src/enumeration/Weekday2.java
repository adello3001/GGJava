package enumeration;

public class Weekday2 {

	public static void main(String[] args) {
		String weekday = "일";
		Week week = null;

		switch(weekday) {
		case "월": week = Week.MON; break;
		case "화": week = Week.TUE; break;
		case "수": week = Week.WED; break;
		case "목": week = Week.THU; break;
		case "금": week = Week.FRI; break;
		case "토": week = Week.SAT; break;
		case "일": week = Week.SUN; break;
		}
		
		System.out.println("Week=" + week);
		
		if(week == Week.SUN) {
			System.out.println("오늘은 일요일입니다.");
		}
		else {
			System.out.println("오늘은 평일입니다.");
		}
	}

}

package enumeration;

public class Weekday1 {

	public static void main(String[] args) {
		Week sun = Week.SUN;
		Week mon = Week.MON;
		Week tue = Week.TUE;
		Week wed = Week.WED;
		Week thu = Week.THU;
		Week fri = Week.FRI;
		Week sat = Week.SAT;
		
		System.out.printf("sun[%s][%d][%s]\n", sun.name(), sun.ordinal(), Week.valueOf("SUN"));
		System.out.printf("mon[%s][%d][%s]\n", mon.name(), mon.ordinal(), Week.valueOf("MON"));
		System.out.printf("tue[%s][%d][%s]\n", tue.name(), tue.ordinal(), Week.valueOf("TUE"));
		System.out.printf("wed[%s][%d][%s]\n", wed.name(), wed.ordinal(), Week.valueOf("WED"));
		System.out.printf("thu[%s][%d][%s]\n", thu.name(), thu.ordinal(), Week.valueOf("THU"));
		System.out.printf("fri[%s][%d][%s]\n", fri.name(), fri.ordinal(), Week.valueOf("FRI"));
		System.out.printf("sat[%s][%d][%s]\n", sat.name(), sat.ordinal(), Week.valueOf("SAT"));
	}

}

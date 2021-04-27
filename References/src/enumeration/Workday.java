/*
 * 1. 오늘의 날짜와 요일 그리고 계절을 출력
 * 2. 각 요일을 한글로 표시(월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일)
 * 3. 각 계절을 한글로 표시(봄, 여름, 가을, 겨울)
 */
package enumeration;

import java.util.Calendar;

public class Workday {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // 일요일(1) ~ 토요일(7)
		
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%d)요일 \n", year, month, day, week);
	
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 요일(%s) (%s) %n",
				year, month, day, 
				(week == 1) ? Week.SUN
				: (week == 2) ? Week.MON
				: (week == 3) ? Week.TUE 
				: (week == 4) ? Week.WED 
				: (week == 5) ? Week.THU 
				: (week == 6) ? Week.FRI : Week.SAT,
				(month >= 3 && month <=5) ? Season.SPRING
				: (month >= 3 && month <=5) ? Season.SPRING
				: (month >= 6 && month <=8) ? Season.SUMMER
				: (month >= 9 && month <=11) ? Season.AUTUMN : Season.WINTER);
	}
}

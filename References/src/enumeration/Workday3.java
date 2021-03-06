/*
 * 1. 오늘의 날짜와 요일 그리고 계절을 출력
 * 2. 각 요일을 한글로 표시(월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일)
 * 3. 각 계절을 한글로 표시(봄, 여름, 가을, 겨울)
 */
package enumeration;

import java.util.Calendar;

public class Workday3 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // 일요일(1) ~ 토요일(7)
		
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%d)요일 \n", year, month, day, week);
	
		// 요일
		Week[] weeks = Week.values();
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%s) %n", year, month, day, weeks[week-1]);
		
		WeekKorean[] weekkors = WeekKorean.values();
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%s) %n", year, month, day, weekkors[week-1]);
	}
}

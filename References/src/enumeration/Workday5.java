/*
 * 1. 오늘의 날짜와 요일 그리고 계절을 출력
 * 2. 각 요일을 한글로 표시(월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일)
 * 3. 각 계절을 한글로 표시(봄, 여름, 가을, 겨울)
 */
package enumeration;

import java.util.Calendar;

public class Workday5 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // 일요일(1) ~ 토요일(7)
		
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%d)요일 \n", year, month, day, week);
	
		// 요일과 계절(아라비아)
		Week[] weeks = Week.values();
		SeasonArabia[] seasons = SeasonArabia.values();
		int x1 = (int)(month / 3); // 몫
		int x2 = (int)(month % 3); // 나머지
		int season = x1 + ((x2 != 0) ? 1 : 0) - 1;
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%s) (%s) %n", year, month, day, weeks[week-1], seasons[season]);

		/*
		for(int mon = 1; mon <= 12; mon++) {
			int x1 = (int)(mon / 3); // 몫
			int x2 = (int)(mon % 3); // 나머지
			int season = x1 + ((x2 != 0) ? 1 : 0);
			System.out.printf("mon(%d), x1(%d), x2(%d), season(%d)\n", mon, x1, x2, season);
		}
		*/
	}
}

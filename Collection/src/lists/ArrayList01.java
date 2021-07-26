/*
 * ArrayList() 초기 용량 : DEFAULT_CAPACITY = 10;
 */
package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String> listLangs = new ArrayList<String>();

		listLangs.add("1.자바");
		listLangs.add("2.자바스크립트");
		listLangs.add("3.파이썬");
		listLangs.add("1.자바"); // 중복해서 들어감
		
		for(String lang : listLangs) {
			System.out.println(lang);
		}
	}

}

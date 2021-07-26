package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.자바");
		listLangs.add("2.자바스크립트");
		listLangs.add("3.파이썬");
		
		
		System.out.println("<ArrayList>");
		
		for(String lang : listLangs) {
			System.out.println(lang);
		}
	}

}

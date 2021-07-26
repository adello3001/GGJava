package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.자바");
		listLangs.add("2.자바스크립트");
		listLangs.add("3.파이썬");

		Iterator<String> it = listLangs.iterator();
		while(it.hasNext()) {
			String lang = it.next();
			System.out.printf("[%s]\n", lang);
		}
	}

}

package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		ArrayList<String> listLangs = new ArrayList<String>();

		listLangs.add("1.자바");
		listLangs.add("2.자바스크립트");
		listLangs.add("3.파이썬");
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}
		
		// 인덱스 1번째에 있는 내용을 바꿈
		listLangs.set(1, "JavaScript");
		
		// 인덱스 2번째에 있는 객체를 삭제
		listLangs.remove(2);
		
		// 리스트에서 해당하는 객체를 찾아서 삭제
		listLangs.remove("1.자바");
		
		System.out.println("<ArrayList>");
		System.out.println("size : " + listLangs.size());
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}
		

		System.out.println("<리스트의 모든 내용을 삭제>");
		listLangs.clear();
		
		System.out.println("size : " + listLangs.size());
		
		for(int cnt=0; cnt < listLangs.size(); cnt++) {
			String lang = listLangs.get(cnt);
			System.out.printf("cnt[%d] [%s]\n", cnt, lang);
		}

	}

}

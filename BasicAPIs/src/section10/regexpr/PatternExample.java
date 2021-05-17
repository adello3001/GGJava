package section10.regexpr;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		// simpleRegExpr();
		multipleRegExpr();
		
	}

	static void multipleRegExpr() {
		String regExp = "(02|010|031)-\\d{3,4}-\\d{4}";
		String[] datum = { 
				"010-123-4567", 
				"02-1234-5432", 
				"02-1234-54320", 
				"010-1234-4567",
				"031-786-1239",
				"032-123-1239",
				"031-12-1239",
				"010-123-123" 
		};
		
		for(int cnt=0; cnt < datum.length; cnt++) {
			String data = datum[cnt];
			boolean result = Pattern.matches(regExp, data);
			if(result) {
				System.out.println("일치하는 자료(O) : " + data);
			}
			else {
				System.out.println("일치하지 않음(X) : " + data);
			}
		}
	}

	static void simpleRegExpr() {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("일치하는 자료 :" + data);
		}
		else {
			System.out.println("일치하지 않는 자료");
		}
	}
}

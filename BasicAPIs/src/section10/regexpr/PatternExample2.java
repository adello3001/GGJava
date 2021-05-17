package section10.regexpr;

import java.util.regex.Pattern;

public class PatternExample2 {

	public static void main(String[] args) {
		multipleRegExpr();
		
	}

	static void multipleRegExpr() {
		// String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String regExp = "\\w+(\\.\\w+)?@\\w+\\.\\w+(\\.\\w+)?";
		String[] datum = { 
				"angle@navercom",
				"angle.web@naver.com",
				"angle@naver.com",
				"angle@naver.co.kr"
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
}

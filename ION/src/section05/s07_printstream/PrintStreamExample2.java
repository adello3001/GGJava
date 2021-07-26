package section05.s07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamExample2 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Temp/print.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.printf("상품의 가격:%d원\n", 123);
		ps.printf("상품의 가격:%6d원\n", 123);
		ps.printf("상품의 가격:%-6d원\n", 123);
		ps.printf("상품의 가격:%06d원\n", 123);
		
		ps.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, Math.PI*10*10);
		
		ps.printf("%6d | %-10s | %10s\n", 1, "홍길동", "도적");
		
		Date now = new Date();
		ps.printf("오늘은 %tY년 %tm월 %td일 입니다\n", now, now, now);
		ps.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다\n", now);
		ps.printf("현재 %1$tH시 %1$tM분 %1$tS초 입니다\n", now);
		ps.printf("현재 %1$tH시 %1$tM분 %2$tS초 입니다\n", now, now);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}

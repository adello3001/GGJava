package linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BoardLinkedListAndArrayList {

	public static void main(String[] args) {
		List<Board> boardsLinkedList = new LinkedList<Board>();
		List<Board> boardsArrayList = new ArrayList<Board>();

		// [ArrayList]
		long startTime2 = System.nanoTime();
		
		for(int cnt=0; cnt < 100000; cnt++) {
			String subject = String.format("공지사항 %d", cnt);
			String content = String.format("공지내용 %d", cnt);
			boardsArrayList.add(0, new Board(subject, content, "관리자"));
		}
		
		long endTime2 = System.nanoTime();
		printTime("ArrayList", startTime2, endTime2);
		
		// [LinkedList]
		long startTime = System.nanoTime(); // 10의 9승분의 1초(10억분의 1초)
		
		for(int cnt=0; cnt < 100000; cnt++) {
			String subject = String.format("공지사항 %d", cnt);
			String content = String.format("공지내용 %d", cnt);
			boardsLinkedList.add(0, new Board(subject, content, "관리자"));
		}
		
		long endTime = System.nanoTime();
		printTime("LinkedList", startTime, endTime);

		
	}
	
	static void printTime(String title, long startTime, long endTime) {
		// double xsec = (endTime - startTime) / 1000000000.0;
		double xsec = (endTime - startTime) / 1.0e9; // ns(10억분의 1초)
		System.out.printf("[%10s] 처리시간(%d)ns, (%f)second\n", title, (endTime - startTime), xsec);
	}
	
	
	static void printBoard(List<Board> boards) {
		System.out.println(">>> printLinkedList <<<");
		for(Board board : boards) {
			System.out.printf("[%s][%s][%s]\n", 
					board.subject,
					board.content,
					board.writer);
		}
	}
}

package vectors;

import java.util.List;
import java.util.Vector;

public class BoardVector {

	public static void main(String[] args) {
		List<Board> boards = new Vector<Board>();
		
		boards.add(new Board("공지사항1", "공지내용1", "관리자"));
		boards.add(new Board("공지사항2", "공지내용2", "실무자"));
		boards.add(new Board("공지사항3", "공지내용3", "대표자"));
		boards.add(new Board("공지사항4", "공지내용4", "개발자"));
		
		printBoard(boards);
		
		// 인덱스 2번째의 객체를 삭제(공지사항3)
		boards.remove(2);

		printBoard(boards);
	}
	
	static void printBoard(List<Board> boards) {
		System.out.println(">>> printBoard <<<");
		for(Board board : boards) {
			System.out.printf("[%s][%s][%s]\n", 
					board.subject,
					board.content,
					board.writer);
		}
	}
}

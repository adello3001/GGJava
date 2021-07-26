package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class BoardLinkedList {

	public static void main(String[] args) {
		List<Board> boards = new LinkedList<Board>();
		
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
		System.out.println(">>> printLinkedList <<<");
		for(Board board : boards) {
			System.out.printf("[%s][%s][%s]\n", 
					board.subject,
					board.content,
					board.writer);
		}
	}
}

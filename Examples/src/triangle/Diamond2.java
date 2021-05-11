package triangle;

public class Diamond2 {
	static final int MAX_ROW = 9;
	static final int HAF_ROW = 5;
	static final int MAX_COL = 9;
	
	char[][] list = new char[MAX_ROW][MAX_COL];
	
	public static void main(String[] args) {
		Diamond2 triangle = new Diamond2();
		triangle.clearDiamond();
		triangle.makeDiamond();
		triangle.drawDiamond();
	}
	
	void clearDiamond() {
		for(int row = 0; row < MAX_ROW; row++) {
			for(int col=0; col < list[row].length; col++) {
				list[row][col] = ' ';
			}
		}
	}
	
	void makeDiamond() {
		for(int row = 0; row < HAF_ROW; row++) {
			int col = HAF_ROW - row - 1;
			int cnt = HAF_ROW - col;
			
			for(int x = 0; x < cnt; x++) {
				list[row][col] = '*';
				col += 2;
			}
		}
		
		for(int row = HAF_ROW; row < MAX_ROW; row++) {	// 5, 6, 7, 8
			int col = row - HAF_ROW + 1;				// 1, 2, 3, 4
			int cnt = MAX_ROW - row;					// 4, 3, 2, 1
			
			for(int x = 0; x < cnt; x++) {
				list[row][col] = '*';
				col += 2;
			}
		}
	}
	
	void drawDiamond() {
		for(int row = 0; row < MAX_ROW; row++) {
			for(char x : list[row]) {
				System.out.printf("%c", x);
			}
			System.out.println();
		}
	}
}

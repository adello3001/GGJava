package triangle;

public class Diamond {
	static final int MAX_ROW = 5;
	static final int MAX_COL = 9;
	
	char[][] list = new char[MAX_ROW][MAX_COL];
	
	public static void main(String[] args) {
		Diamond triangle = new Diamond();
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
		for(int row = 0; row < MAX_ROW; row++) {
			int col = MAX_ROW - row - 1;
			int cnt = MAX_ROW - col;
			
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

		for(int row = MAX_ROW - 2; row >= 0; row--) {
			for(char x : list[row]) {
				System.out.printf("%c", x);
			}
			System.out.println();
		}
	}
}

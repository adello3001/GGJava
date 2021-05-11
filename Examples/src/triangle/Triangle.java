package triangle;

public class Triangle {
	static final int MAX_ROW = 5;
	static final int MAX_COL = 9;
	
	char[][] list = new char[MAX_ROW][MAX_COL];
	
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.clearTriangle();
		triangle.makeTriangle();
		triangle.drawTriangle();
	}
	
	void clearTriangle() {
		for(int row = 0; row < MAX_ROW; row++) {
			for(int col=0; col < list[row].length; col++) {
				list[row][col] = ' ';
			}
		}
	}
	
	void makeTriangle() {
		for(int row = 0; row < MAX_ROW; row++) {
			int col = MAX_ROW - row - 1; // 4, 3, 2, 1, 0
			int cnt = MAX_ROW - col;     // 1, 2, 3, 4, 5
			
			for(int x = 0; x < cnt; x++) {
				list[row][col] = '*';
				col += 2;
			}
		}
	}
	
	void drawTriangle() {
		for(int row = 0; row < MAX_ROW; row++) {
			for(char x : list[row]) {
				System.out.printf("%c", x);
			}
			System.out.println();
		}
	}

}

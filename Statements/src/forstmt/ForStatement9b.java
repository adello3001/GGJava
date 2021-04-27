package forstmt;
/*
 * 반복문(for)
 * 무한루프
*/
public class ForStatement9b {

	public static void main(String[] args) {
		int cnt = 0;
		for(;;) {
			if(cnt++ >= 100) {
				break;
			}
			
			System.out.println("cnt=" + cnt);
		}
		
		System.out.println("last cnt=" + cnt);
	}
}

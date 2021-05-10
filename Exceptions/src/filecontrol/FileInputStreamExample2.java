/*
 * Java 7
 * try-with-resources
 * try(....)
 * try를 벗어나게 되면 자동으로 리소스를 해제
 * interface AutoCloseable의 구현 객체 정의
 */
package filecontrol;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
		try(FileInputStream	fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("파일처리 예외발생");
		}
		/*
		finally {
			if(fis != null) { // 필요없음, 자동으로 fis.close()가 호출됨
				// fis.close();
				try {
					fis.close();
				}
				catch(Exception e) {
				}
			}
		}
		*/
		
		System.out.println("파일처리 완료");
	}
}

/*
 * FileWriter(File, append)
 * append : 파일이 존재하면 내용을 추가할지 덮어 쓸지 결정
 *   - true : 기존의 내용을 유지하면서 새로운 내요을 추가
 *   - false : 덮어 쓰기
 */
package section04.s04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("D:/Temp/test-1.txt");	
		
		boolean append = false;
		FileWriter fw = new FileWriter(file, append); 	
		
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}


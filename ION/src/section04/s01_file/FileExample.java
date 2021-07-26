/*
 * File
 *   - 파일 정보: 파일이름, 파일크기, 파일속성
 *   - 파일 생성, 파일 삭제
 *   - 디렉토리 생성
 *   - 디렉토리 삭제
 *   - 디렉토리 정보
 */
package section04.s01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("D:/Temp/NewDir");
		File file1 = new File("D:/Temp/NewDir/file1.txt");
		File file2 = new File("D:/Temp/NewDir/file2.txt");
		File file3 = new File(new URI("file:///D:/Temp/NewDir/file3.txt"));
		
		if(dir.exists() == false) {  dir.mkdirs();  }
		if(file1.exists() == false) {  file1.createNewFile();  }
		if(file2.exists() == false) {  file2.createNewFile();  }
		if(file3.exists() == false) {  file3.createNewFile();  }

		File temp = new File("D:/Temp/NewDir");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날짜              시간         형태       크기    이름");
		System.out.println("-------------------------------------------------------------------");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.print("\t<File>\t" + file.length() + "\t" + file.getName());
			}
 			System.out.println();
		}
	}
}

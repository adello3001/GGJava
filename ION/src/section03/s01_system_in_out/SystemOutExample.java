package section03.s01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;		
		
		for(byte b=48; b<58; b++) { // 숫자(0~9)
			os.write(b);
		}		
		os.write(10); // LF(Line Feed)
		
		for(byte b=97; b<123; b++) { // 알파벳(a~z)
			os.write(b);
		}		
		os.write(10); // LF(Line Feed)

		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
	}
}


package filecontrol;

public class FileInputStreamExample {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("file.txt");
			fis.read();
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("颇老贸府 抗寇惯积");
		}
		finally { 
			if(fis != null) { // Java 6
				// fis.close();
				try {
					fis.close();
				}
				catch(Exception e) {
				}
			}
		}
		
		System.out.println("颇老贸府 肯丰");
	}
}

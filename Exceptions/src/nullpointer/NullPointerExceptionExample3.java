/*
 * NullPointerException ex = new NullPointerException();
 */
package nullpointer;

public class NullPointerExceptionExample3 {

	public static void main(String[] args) {
		String data = null;
		
		try {
			System.out.println(data.toString());
		}
		catch(NullPointerException ex) {
			System.out.println("data is null");
		}
		
		System.out.println("THE END");
	}
	
}



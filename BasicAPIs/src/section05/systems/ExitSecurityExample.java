package section05.systems;

public class ExitSecurityExample {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				System.out.println("setSecurityManager: status=" + status);
				if(status != 5) {
					throw new SecurityException(String.valueOf(status));
				}
			}
		});
		
		for(int i=0; i < 10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			}
			catch(SecurityException e) {
				System.out.println("SecurityException: " + e.getMessage());
			}
		}
	}
}

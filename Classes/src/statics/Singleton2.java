package statics;

public class Singleton2 {
	  public static void main(String[] args) {
	    Singleton2.run();
	  }

	  private static Singleton2 singleton = new Singleton2();

	  private Singleton2() {}

	  static Singleton2 getInstance() {
	    return singleton;
	  }

	  static void run() {
	    Singleton2 s1 = Singleton2.getInstance();
	    Singleton2 s2 = Singleton2.getInstance();

	    System.out.println("(s1 == s2) ? : " + (s1 == s2));
	  }
	}
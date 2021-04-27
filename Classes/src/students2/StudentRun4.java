package students2;

public class StudentRun4 {
	public static void main(String[] args) {
		Student student1 = new Student("007", "제임스본드");
		student1.print("[영화학교]");
		
		Student student2 = new Student("100", "수학영재");
		student2.print("[수학학교]");

		student1.print("[영화학교2]");
	}
}

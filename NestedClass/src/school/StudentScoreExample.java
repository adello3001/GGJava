package school;

public class StudentScoreExample {

	public static void main(String[] args) {
		// Student student = new Student("¿ìµî»ı", "010", 21);
		// Student.Score score = student.new Score(100, 100, 100);
		
		// Student2.Score score = new Student2.Score();
		Student2.Score score = new Student2.Score(90,90,90);
		
		int total = score.total();
		float average = score.average();
		
		System.out.println("> total : " + total);
		System.out.println("> average : " + average);
	}

}

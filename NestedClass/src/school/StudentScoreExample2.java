package school;

public class StudentScoreExample2 {

	public static void main(String[] args) {
		Student student = new Student("¿ìµî»ı", "010", 21);

		Student.Score score = student.new Score(100, 100, 100);
		
		int total = score.total();
		float average = score.average();
		
		student.information();
		System.out.println("> total : " + total);
		System.out.println("> average : " + average);
	}

}

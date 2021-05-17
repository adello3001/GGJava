package school;

public class StudentScoreExample4 {

	public static void main(String[] args) {
		Student4 student = new Student4("¿ìµî»ý", "070", 21);
		Student4.Score score = student.new Score(70, 80, 90);
		score.printScore();
	}

}

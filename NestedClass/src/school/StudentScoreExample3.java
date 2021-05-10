package school;

public class StudentScoreExample3 {

	public static void main(String[] args) {
		Student3 student = new Student3("¿ìµî»ý", "010", 21);

		int total = student.total(80, 90, 100);
		
		student.information();
		System.out.println("> total : " + total);
	}

}

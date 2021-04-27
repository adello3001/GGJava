package students3;

public class StudentRun3 {

	public static void main(String[] args) {
		// Student student = new Student();
		Student student = new Student("1000", "장학생", 20, "한국대", "경기성남", "2021");
		student.printAll();
		
		School school = student.schoolObject(); 
		System.out.println(">>> 학교정보 <<<");
		System.out.println("\t> 학교이름: " + school.name);
		System.out.println("\t> 학교주소: " + school.address);
		System.out.println("\t> 설립년도: " + school.buildyear);
		System.out.println("----------------------------------------");
		System.out.println("\t> 학교이름: " + student.school.name);
		System.out.println("\t> 학교주소: " + student.school.address);
		System.out.println("\t> 설립년도: " + student.school.buildyear);
	}

}

package students2;

public class StudentRun3 {
	public static void main(String[] args) {
		Student student = new Student("007", "제임스본드");
		
		student.print();
		
		student.name = "로저무어";
		
		System.out.println("[학생정보]");
		System.out.println("\t> 학번: " + student.no);
		System.out.println("\t> 이름: " + student.name);
		System.out.println("\t> 나이: " + student.age);
		System.out.println("\t> 학년: " + student.major);
		System.out.println("\t> 학과: " + student.subject);
		System.out.println("\t> 상태: " + student.status);
		System.out.println("\t> 학점: " + student.score);

		student.print();

		student.name = "숀코네리";
		
		student.print("[영화주인공]");
		
	}
}

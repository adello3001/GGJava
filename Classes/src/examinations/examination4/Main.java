package examinations.examination4;

public class Main {

	public static void main(String[] args) {
		Examin e1 = new Examin(5);
		e1.setSubject(0, new Subject("국어", 100));
		e1.setSubject(1, new Subject("영어", 80));
		e1.setSubject(2, new Subject("수학", 60));
		e1.setSubject(3, new Subject("과학", 60));
		e1.setSubject(4, new Subject("사회", 90));
		
		Student s1 = new Student("1000", "일인자", e1);
		s1.printExam();
		
		Examin e2 = new Examin(3);
		
		e2.setSubject(0, "국어", 99);
		e2.setSubject(1, "역사", 100);
		
		e2.setSubject(2, new Subject("사회", 100));		
		
		Student s2 = new Student("2000", "이인자", e2);
		s2.printExam();		
	}
}

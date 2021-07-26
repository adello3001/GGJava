/*
 * 모든 클래스는 인스턴스화 되어야만 객체로서 사용할 수 있다.
 * 객체.속성
 * 객체.메소드()
 */
package students;

public class StudentRun {
	String me = "StudentRun!!!";
	
	public static void main(String[] args) {
		StudentRun strun = new StudentRun(); // 선언(declare)
		System.out.println(strun.me);
		
		Student student1 = new Student(); // 선언(declare)
		student1.printInfo();
		
		String info = student1.info("정보");
		System.out.println(info);
		
		Student student2 = new Student();
		System.out.println("(student == student2) ? " + (student1 == student2));
				
	}

}

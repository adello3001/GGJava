package students3;

public class Student {
	String no;
	String name;
	int age = -1;
	
	School school = new School();
	
	/*
	String schoolname;
	String schooladdress;
	String schoolbuild;
	*/ 

	Student() {
		System.out.println("Student: 기본생성자");
		age = 0;
	}
	
	Student(String no, String name, int age) {
		System.out.println("Student: 학번, 이름, 나이");
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	Student(String no, String name, int age, String schoolname, String schooladdress, String schoolbuild) {
		this(no, name, age);  // 자기 자신의 생성자를 호출, 다른 표현식 보다 최우선으로 기술되어야 한다.
		this.school.name = schoolname;
		this.school.address = schooladdress;
		this.school.buildyear = schoolbuild;
		System.out.println("Student: 전체속성");
	}
	
	void printAll() {
		print();
		printSchool();
	}
	
	void printSchool() {
		System.out.println("[학교정보]");
		System.out.println("\t> 학교이름: " + this.school.name);
		System.out.println("\t> 학교주소: " + this.school.address);
		System.out.println("\t> 설립년도: " + this.school.buildyear);
	}

	void print() {
		printTitle("[학생정보출력]");
	}
	
	void print(String title) {
		printTitle(title);
	}
	
	void printTitle(String title) {
		System.out.println(title);
		System.out.println("\t> 학번: " + this.no);
		System.out.println("\t> 이름: " + this.name);
		System.out.println("\t> 나이: " + this.age);
		/*
		System.out.println("\t> 학년: " + this.major);
		System.out.println("\t> 학과: " + this.subject);
		System.out.println("\t> 상태: " + this.status);
		System.out.println("\t> 학점: " + this.score);
		*/
	}

	// 학생이 가지고 있는 school 객체를 리턴
	School schoolObject() {
		return school;
	}
}

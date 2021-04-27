/*
 * [클래스의 생성자]
 *   1. 생성자를 정의하지 않으면 컴파일러는 기본생성자를 자동으로 만들어 준다.
 *   2. 클래스의 생성자는 클래스의 이름과 동일해야 한다.
 *   3. 리턴 타입이 없다.
 *   4. 생성자를 여러개 만들수 있지만 파라미터가 달라야 한다.
 *   5. this는 클래스가 객체와 되었을 때 가지고 있는 메모리 주소
 */
package students2;

class Student {
	String no;
	String name;
	int age;
	String major;
	String subject;
	String handphone;
	boolean status;
	float score;
	
	Student() { // 생성자(기본)
		System.out.println("Student -> 기본 생성자");
		this.status = true;
	}
	
	Student(String no, String name) { // 생성자(학번, 이름)
		System.out.printf("Student -> 생성자2: no(%s), name(%s)\n", no, name);
		this.no = no;
		this.name = name;
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
		System.out.println("\t> 학년: " + this.major);
		System.out.println("\t> 학과: " + this.subject);
		System.out.println("\t> 상태: " + this.status);
		System.out.println("\t> 학점: " + this.score);
	}

}

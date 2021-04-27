/*
 * 객체는 속성과 메소드(행위)로 이루어진다.
 */
package students;

class Student { // 정의(definition)
	// 속성(특성): attribute, field, property
	String no = "2021001";       	// 학번
	String name = "홍길동"; 	 	// 이름
	int age = 21; 	 	 			// 나이
	String major = "1학년";	 		// 학년
	String subject = "사회복지";  	// 학과
	String handphone;				// 핸드폰
	
	public static void main(String[] args) {
		Student student = new Student();
		student.printInfo();
	}

	// 메소드(함수) : method, function(클래스에 종속된 함수)
	// 리턴타입 메소드이름([파라미터]) { }
	void printInfo() { // 학생의 정보를 출력
		System.out.println("[학생정보]");
		System.out.println("\t> 학번: " + this.no);
		System.out.println("\t> 이름: " + this.name);
		System.out.println("\t> 나이: " + this.age);
		System.out.println("\t> 학년: " + this.major);
		System.out.println("\t> 학과: " + this.subject);
	}
	
	String info(String title) {
		/*
		String strInfo = title + ":" + "[" + no + "][" + name + "]";
		return strInfo;
		*/
		
		return title + ":" + "[" + no + "][" + name + "]";
	}
}

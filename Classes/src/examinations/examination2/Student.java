package examinations.examination2;

class Student {
	String id;
	String name;
	
	// 속성의 초기값을 지정하지 않으면 참조형은 null로 초기화 된다.
	// 명시적으로 초기값을 null로 지정할 수 있다.
	Examin exam = null;  

	Student(String id, String name) { // 생성자(constructor)
		this.id = id;
		this.name = name;
	}

	Student(String id, String name, Examin exam) { // 생성자(constructor)
		this.id = id;
		this.name = name;
		this.exam = exam;
	}
	
	void setExamin(Examin exam) {
		this.exam = exam;
	}
	
	void computeExam() {
		this.exam.compute();
	}
	
	void printExam() {
		System.out.println(">       id:" + id);
		System.out.println(">     name:" + name);
		System.out.println(">   korean:" + exam.kor);
		System.out.println(">  english:" + exam.eng);
		System.out.println(">     math:" + exam.math);
		System.out.println(">    total:" + exam.total());
		System.out.println("> avgerage:" + exam.avg());
		System.out.println("-----------------------------------");
	}
}

package examinations.examination1;

class Student {
	String id;
	String name;
	Examin exam;
	
	Student(String id, String name, Examin exam) { // »ý¼ºÀÚ(constructor)
		this.id = id;
		this.name = name;
		this.exam = exam;
	}
	
	void printExam() {
		System.out.println(">      id:" + id);
		System.out.println(">    name:" + name);
		System.out.println(">  korean:" + exam.kor);
		System.out.println("> english:" + exam.eng);
		System.out.println(">    math:" + exam.math);
		System.out.println(">   total:" + exam.total());
		System.out.println("> avgerag:" + exam.avg());
		System.out.println("-----------------------------------");
	}
}

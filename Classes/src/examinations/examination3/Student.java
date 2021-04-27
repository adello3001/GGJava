package examinations.examination3;

class Student {
	String id;
	String name;
	Examin exam;

	Student(String id, String name, Examin exam) {
		this.id = id;
		this.name = name;
		this.exam = exam;
	}
	
	void computeExam() {
		if(this.exam != null) {
			this.exam.compute();
		}
	}

	void printExam() {
		if(this.exam == null) {
			System.out.printf("id(%s), name(%s)에 대한 시험 정보가 없습니다.\n", id, name);
			System.out.printf("시험정보를 등록해 주세요.\n\n");
			return;
		}
		
		System.out.println(">       id:" + id);
		System.out.println(">     name:" + name);
		
		for(int subcnt = 0; subcnt < exam.getSubCount(); subcnt++) {
			System.out.printf(">     %s: %d\n", 
					exam.getSubject(subcnt), 
					exam.getScore(subcnt));
		}
		
		System.out.println(">    total: " + exam.total());
		System.out.println("> avgerage: " + exam.avg());
		System.out.println("-----------------------------------");
	}
}

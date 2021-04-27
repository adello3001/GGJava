/*
 * 학생정보: 학번, 이름
 */
package examinations.examination4;

public class Student {
	String id;		// 학번
	String name;	// 이름
	Examin examin;  // 시험정보
	
	Student(String id, String name, Examin examin) {
		this.id = id;
		this.name = name;
		this.examin = examin;
	}
	
	void printExam() {
		System.out.printf(">>> id(%s), name(%s) <<< \n", this.id, this.name);

		for(int subcnt = 0; subcnt < examin.getSubcnt(); subcnt++) {
			Subject subject = examin.getSubject(subcnt);
			if(subject != null) {
				System.out.printf("[%d][%s]=[%d]\n", subcnt, subject.subname, subject.score);
			}
		}
	
		System.out.printf(">>> total(%d), average(%f)\n", examin.total(), examin.average());
	}
}

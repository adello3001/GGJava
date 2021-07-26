/*
 * 학생의 학번과 이름이 같으면 같은 자료로 처리
 */
package maps;

public class Student {
	int sno;
	String name;
	int score;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public Student(int sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}

	public int hashCode() {
		return sno + name.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		
		return false;
	}
}

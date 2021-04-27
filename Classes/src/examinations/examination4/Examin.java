/*
 * 시험정보: 
 */
package examinations.examination4;

public class Examin {
	Subject[] subjects;
	int subcnt;
	int total;
	float avg;
	
	Examin(int subcnt) {
		this.subcnt = subcnt;
		this.subjects = new Subject[subcnt];
	}
	
	int getSubcnt() {
		return this.subcnt;
	}
	
	void setSubject(int index, Subject subject) {
		if(index < 0 || index >= subcnt) {
			System.out.println("인덱스 값이 범위를 넘어섰습니다.");
			System.out.printf("인덱스 값의 범위: 0 <= (%d) < (%d)\n", index, this.subcnt);
			return;
		}
		
		this.subjects[index] = subject;
	}
	
	void setSubject(int index, String subname, int score) {
		if(index < 0 || index >= subcnt) {
			System.out.println("인덱스 값이 범위를 넘어섰습니다.");
			System.out.printf("인덱스 값의 범위: 0 <= (%d) < (%d)\n", index, this.subcnt);
			return;
		}
		
		this.subjects[index] = new Subject(subname, score);
	}
	
	Subject getSubject(int index) {
		if(index < 0 || index >= subcnt) {
			System.out.println("인덱스 값이 범위를 넘어섰습니다.");
			System.out.printf("인덱스 값의 범위: 0 <= (%d) < (%d)\n", index, this.subcnt);
			return null;
		}
		
		return this.subjects[index];
	}
	
	int total() {
		this.total = 0;
		
		for(Subject subject : this.subjects) {
			this.total += subject.score; 
			// this.total = this.total + subject.score; 
		}
		
		return this.total;
	}
	
	float average() {
		this.avg = (float)this.total() / (float)this.subcnt;
		return this.avg;
	}
}

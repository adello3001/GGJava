package examinations.examination1;

public class Examin {
	int kor, eng, math;
	int total;
	float cnt = 3.0f;
	float avg;
	
	Examin() {
	}
	
	public Examin(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	int total() {
		this.total = this.kor + this.eng + this.math;
		return this.total;
	}
	
	float avg() {
		this.avg = (float)(this.total / cnt);
		return this.avg;
	}
}

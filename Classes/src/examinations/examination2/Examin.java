package examinations.examination2;

class Examin {
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
		// compute();
	}
	
	void compute() {
		this.total = this.kor + this.eng + this.math;
		this.avg = (float)(this.total / cnt);
	}

	void setKor(int kor) { // setter
		this.kor = kor;
		// compute();
	}
	
	void setEng(int eng) {
		this.eng = eng;
		// compute();
	}
	
	void setMath(int math) {
		this.math = math;
		// compute();
	}
	
	int total() {
		return this.total;
	}
	
	float avg() {
		return this.avg;
	}
}

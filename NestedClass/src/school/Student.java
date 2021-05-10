/*
 * [切荤青沥]
 * 1. 切积(student)
 */
package school;

public class Student {
	String name;
	String tel;
	int age;
	
	class Score {
		int kor, eng, math;
		Score() {}
		Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		int total() {
			return this.kor + this.eng + this.math;
		}
		
		float average() {
			return (this.kor + this.eng + this.math) / 3.0f;
		}
	}
	
	Student() {
		System.out.println("class Student() 积己磊");
	}
	
	Student(String n, String t, int a) {
		System.out.printf("Student(...) 积己磊 : name(%s), tel(%s), age(%d)\n", n, t, a);
		this.name = n;
		this.tel = t;
		this.age = a;
	}
	
	void information() {
		System.out.printf("Student:name(%s), tel(%s), age(%d)\n", this.name, this.tel, this.age);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	int getAge() {
		return this.age;
	}
}

/*
 * [학사행정]
 * 1. 학생(student)
 */
package school;

public class Student4 {
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
		
		void printScore() {
			information(); // 바깥 클래스의 멤버 메소드에 접근(Student4)
			Student4.this.information(); // 바깥 클래스의 멤버 메소드에 접근(Student4)
			
			// 바깥 클래스의 멤버 필드에 접근(Student4)
			System.out.printf("> Student:name(%s), tel(%s), age(%d)\n", name, tel, age);
			System.out.printf("> Student:name(%s), tel(%s), age(%d)\n", 
					Student4.this.name, Student4.this.tel, Student4.this.age);
			
			// 자기 자신(Score)
			System.out.println("> total : " + this.total());
			System.out.println("> average : " + this.average());
		}
	} // [END Score]
	
	Student4() {
		System.out.println("class Student() 생성자");
	}
	
	Student4(String n, String t, int a) {
		System.out.printf("Student(...) 생성자 : name(%s), tel(%s), age(%d)\n", n, t, a);
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

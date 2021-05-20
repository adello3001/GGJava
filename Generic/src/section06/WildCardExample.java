package section06;

import java.util.Arrays;

public class WildCardExample {
	/*
	public static <T> void registerCourse(Course<T> course) {
		System.out.println(course.getName() + "수강생: " 
				+ Arrays.toString(course.getStudents()));
	}
	*/

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: " 
				+ Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		person();
		worker();
		student();
	}
	
	public static void person() {
		Course<Person> personCourse = new Course<Person>("{일반인과정}", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
	}

	public static void worker() {
		Course<Worker> personCourse = new Course<Worker>("{직장인과정}", 5);
		personCourse.add(new Worker("공무원"));
		personCourse.add(new Worker("회사원"));
		
		registerCourse(personCourse);
	}

	public static void student() {
		Course<Student> personCourse = new Course<Student>("{학생과정}", 5);
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
	}

}

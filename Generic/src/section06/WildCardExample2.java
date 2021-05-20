package section06;

import java.util.Arrays;

public class WildCardExample2 {
	public static void registerCourse(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: " 
				+ Arrays.toString(course.getStudents()));
	}

	public static void registerCourseHighStudent(Course<? super HighStudent> course) {
		System.out.println(course.getName() + "수강생: " 
				+ Arrays.toString(course.getStudents()));
	}


	public static void main(String[] args) {
		// student();
		// highStudent();
		superHighStudent();		
	}

	public static void student() {
		Course<Student> studentCourse = new Course<Student>("{학생과정}", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(studentCourse);
	}

	public static void highStudent() {
		Course<HighStudent> studentCourse = new Course<HighStudent>("{학생과정}", 5);
		studentCourse.add(new HighStudent("풍생고"));
		studentCourse.add(new HighStudent("이매고"));
		studentCourse.add(new HighStudent("양영고"));
		
		registerCourse(studentCourse);
	}
	
	public static void superHighStudent() {
		Course<Student> studentCourse = new Course<Student>("{학생과정}", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		registerCourseHighStudent(studentCourse);

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("{학생과정}", 5);
		highStudentCourse.add(new HighStudent("풍생고"));
		highStudentCourse.add(new HighStudent("이매고"));
		highStudentCourse.add(new HighStudent("양영고"));
		registerCourseHighStudent(highStudentCourse);
		
		Course<Person> personCourse = new Course<Person>("{일반인과정}", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		registerCourseHighStudent(personCourse);
		// registerCourse(personCourse);
	}
}

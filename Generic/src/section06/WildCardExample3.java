package section06;

import java.util.Arrays;

public class WildCardExample3 {
	public static void registerCourse(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: " 
				+ Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("{일반인과정}", 5);
		personCourse.add(new Person("일반인"));
		registerCourse(personCourse);
		
		Course<Worker> workerCourse = new Course<Worker>("{직장인과정}", 5);
		// workerCourse.add(new Person("직장인"));
		workerCourse.add(new Worker("직장인"));
		registerCourse(workerCourse);
	}

}

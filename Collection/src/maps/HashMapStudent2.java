package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStudent2 {

	public static void main(String[] args) {
		Map<Student, Integer> students = new HashMap<Student, Integer>();

		Student no   = new Student(1010, "노우민");
		Student moon = new Student(1020, "문수호");
		Student pak  = new Student(1030, "박형선");

		students.put(no, 90);
		students.put(moon, 95);
		students.put(pak, 100);
		
		printMap(students);
		
		searchMap(students, pak);
		searchMap(students, no);
		searchMap(students, moon);
	}
	
	static void searchMap(Map<Student, Integer> students, Student student) {
		Integer value = students.get(student);
		System.out.printf("> search: sno(%s), name(%s), value(%d)%n", 
				student.sno, student.name, value);
	}
	
	static void printMap(Map<Student, Integer> maps) {
		System.out.println("maps.size : " + maps.size());
		
		Set<Map.Entry<Student, Integer>> entrySet = maps.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIterator.next();
			Student student = entry.getKey();
			Integer value = entry.getValue();
			System.out.printf("key:sno(%s), name(%s), value(%d)%n", 
					student.sno, student.name, value);
		}
	}
	

}

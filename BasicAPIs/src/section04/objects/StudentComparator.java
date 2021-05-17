package section04.objects;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) {
			return -1;
		}
		else if(a.sno == b.sno) {
			if(a.ssn < b.ssn) {
				return -1;
			}
			else if(a.ssn == b.ssn) {
				return 0;
			}
			return 1;
		}
		else {
			return 1;
		}
	}
}

package chap03;

public class Exercise04 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students); // 몫
		System.out.println("pencilsPerStudent=" + pencilsPerStudent);
		
		// 나눠 준 연필
		int pencilsStudents = pencilsPerStudent * 30; // 검산
		System.out.printf("pencilsStudents: pencils(%d), pencilsStudents(%d)\n", pencils, pencilsStudents);
		
		// 남은 연필 수
		int pencilsLeft = (pencils % students); // 나머지
		System.out.println("pencilsLeft=" + pencilsLeft);

	}

}

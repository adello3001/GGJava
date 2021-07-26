package nullpointer;

public class NullPointerExceptionExample2 {

	public static void main(String[] args) {
		String data = null;
		if(data == null) {
			System.out.println("data is null");
			System.out.println(data); // 내부에서 null 체크를 해서 출력을 했기 때문에 오류가 나오지 않음
		}
		
		String nullstring = (data == null) ? "<null>" : data.toString();
		System.out.println(nullstring);
	}

}

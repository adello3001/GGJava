package section02.generic;

public class ContainerRun {

	public static void main(String[] args) {
		Container<String> container = new Container<String>();
		container.set("ȫ�浿");
	    String str = container.get();
	    System.out.println(str);
	}

}

package section02.generic;

public class ContainerRun3 {

	public static void main(String[] args) {
		Container container = new Container();
		container.set("ȫ�浿");
	    String str = (String)container.get();
	    System.out.println(str);
	}

}

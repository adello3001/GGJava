package section02.generic;

public class ContainerRun2 {

	public static void main(String[] args) {
		Container<Integer> container = new Container<Integer>();
		container.set(1234);
	    int val = container.get() + 10;
	    System.out.println(val);
	}

}

package statics;

public class CreateInstanceRun {
	public static void main(String[] args) {
		CreateInstance c1 = CreateInstance.createInstance(new String[] {"plus", "10", "20"} );
		c1.print();
		
		CreateInstance c2 = CreateInstance.createInstance(new String[] {"minus", "20", "10"} );
		c2.print();

		CreateInstance c3 = CreateInstance.createInstance(new String[] {"none", "20", "10"} );
		c3.print();
		
		/*
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int z = 0;
		String config = args[0];
		if(config.equals("plus")) {
			z = x + y;
		}
		else if(config.equals("minus")) {
			z = x - y;
		}
		else {
			z = 0;
		}

		// private CrateInstance이므로 객체를 생성할 수 없음
		CreateInstance c4 =  new CreateInstance(x, y, z);
		c4.setConfig(config);
		c4.print();
		*/
	}

}

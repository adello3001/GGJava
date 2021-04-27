package statics;

public class CreateInstance {
	private int x, y, z;
	public String config = "";
	
	private CreateInstance() {}
	
	private CreateInstance(int x, int y, int z) {
		System.out.printf("CreateInstance(%d, %d, %d)\n", x, y, z);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void setConfig(String config) {
		this.config = config;
	}

	public static CreateInstance createInstance(String[] args) {
		if(args.length < 3) {
			return new CreateInstance();
		}
		
		String config = args[0];
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int z = 0;
		
		if(config.equals("plus")) {
			z = x + y;
		}
		else if(config.equals("minus")) {
			z = x - y;
		}
		else {
			z = 0;
		}
		
		CreateInstance obj = new CreateInstance(x, y, z);
		obj.setConfig(config);
		
		return obj;
	}
	
	public void print() {
		System.out.printf("print:[%s] -> (%d, %d, %d)\n", this.config, this.x, this.y, this.z);
	}
}

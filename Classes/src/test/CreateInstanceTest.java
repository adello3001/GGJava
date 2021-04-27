/*
 * > cmd
 * java statics.CreateInstanceRun2 plus 90 20
 * java statics.CreateInstanceRun2 minus 90 20
 * 
 */
package test;

import statics.CreateInstance;

public class CreateInstanceTest {

	public static void main(String[] args) {  // minus 90 10
		CreateInstance c1 = CreateInstance.createInstance(args);
		c1.print();
		
		// System.out.printf("CreateInstance.x(%d)", c1.x);
		System.out.printf("CreateInstance.config(%s)", c1.config);
	}
}

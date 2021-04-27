/*
 * > cmd
 * java statics.CreateInstanceRun2 plus 90 20
 * java statics.CreateInstanceRun2 minus 90 20
 * 
 */
package statics;

public class CreateInstanceRun2 {

	public static void main(String[] args) {  // minus 90 10
		CreateInstance c1 = CreateInstance.createInstance(args);
		c1.print();
	}
}

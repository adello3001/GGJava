/*
 * [깊은 복제]
 * - 참조객체도 복제를 제공
 */

package section03.deepclone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	
	// 참조객체
	public int[] scores;
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member)super.clone();
		// cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.scores = new int[this.scores.length];
		for(int cnt = 0; cnt < this.scores.length; cnt++) {
			cloned.scores[cnt] = this.scores[cnt];
		}
		
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member getMember() {
		Member clonedMember = null;
		
		try {
			clonedMember = (Member)clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Member Object is not supported");
		}
		return clonedMember;
	}

}

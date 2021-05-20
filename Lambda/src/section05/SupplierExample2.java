/*
 * [Supplier �Լ��� �������̽�]
 * - ���ϰ��� �ִ� �޼ҵ带 ������ �ִ� �Լ��� �������̽�
 * @FunctionalInterface
 * public interface IntSupplier {
 *    int getAsInt();
 * }
 */
package section05;

import java.util.function.Supplier;

public class SupplierExample2 {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> {
			int num = (int)(Math.random() * 6 + 1);
			return num;
		};
		
		for(int x = 0; x < 6; x++) {
			int num = supplier.get();
			System.out.println("���� ��: " + num);
		}
	}

}

/*
 * Stack(스텍)
 *   - 후입선출: 나중에 들어온 것이 먼저 나감
 *   - LIFO(Last In First Out)
 *   - JVM 스택 메모리
 */
package stacks;

import java.util.Stack;

public class StackCoin2 {

	public static void main(String[] args) {
		Stack<Coin> coins = new Stack<Coin>();
		
		// push() : 객체를 스택에 넣음
		coins.push(new Coin(90));
		coins.push(new Coin(60));
		coins.push(new Coin(40));
		coins.push(new Coin(30));
		coins.push(new Coin(10));

		peekStack(coins);
		popStack(coins);

	}
	
	// pop() : 스택에서 객체를 꺼낸 후 삭제
	static void popStack(Stack<Coin> coins) {
		System.out.println("Stack: size=" + coins.size());
		
		while(coins.isEmpty() != true) {
			Coin coin = coins.pop();
			System.out.println(coin.getValue());
		}
	}
	
	// peek() : 스택에서 맨 위에 있는 객체를 가져오며 삭제하지는 않는다.
	static void peekStack(Stack<Coin> coins) {
		System.out.println("Stack:peek -> size=" + coins.size());
		
		Coin coin = coins.peek();
		System.out.println(coin.getValue());
	}
	
}

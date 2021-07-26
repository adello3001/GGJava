/*
 * Queue(큐)
 *   - 선입선출: 먼저 들어온 것이 먼저 나감
 *   - FIFO(First In First Out)
 *   - 스레드풀(Thread Pool)
 *   - 메시지큐: 마우스, 키보드
 *   - 작업큐: 대기줄
 */
package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMessage {

	public static void main(String[] args) {
		Queue<Message> messages = new LinkedList<Message>();
		
		// 큐에 메시지를 넣음
		messages.offer(new Message("준비", "박형선"));
		messages.offer(new Message("작업", "문수호"));
		messages.offer(new Message("이동", "노우민"));
		
		pollMessages(messages);
		pollMessages(messages); // 큐가 다 비워져서 자료가 없음
	}
	
	// Queue.poll() : 큐에서 메시지를 꺼내고 삭제
	static void pollMessages(Queue<Message> messages) {
		System.out.println("[pollMessages] size=" + messages.size());
		
		while(messages.isEmpty() != true) {
			Message message = messages.poll();
			switch(message.command) {
				case "준비":
					System.out.printf("[준비하세요] command=%s, to=%s%n",message.command, message.to);
					break;
				case "작업":
					System.out.printf("[작업하세요] command=%s, to=%s%n",message.command, message.to);
					break;
				case "이동":
					System.out.printf("[이동하세요] command=%s, to=%s%n",message.command, message.to);
					break;
			}
		}
	}
}

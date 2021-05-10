package exercises.exercise06;

public class Chatting {
	void startChat(String chatId) {
		/*
		 * 익명 구현 객체에서 로컬 변수를 사용하게 되면
		 * 그 변수는 final 특성을 갖게 되므로 값을 변경할 수 없다.
		String nickName = null;
		nickName = chatId;
		*/
		// final 특성을 갖게 됨
		// String nickName = chatId;
		final String nickName = chatId;
		
		Chat chat = new Chat() { // 익명 구현 객체에서 nickName을 사용
			@Override
			public void start() {
				while(true) {
					String inputData = "Hi!";
					String msg = "[" + nickName + "]" + inputData;
					// String msg = "[" + chatId + "]" + inputData;
					send(msg);
				}
			}
		};
		
		chat.start();
	}
	
	public class Chat {
		void start() {}
		void send(String msg) {}
	}
}

package exercises.exercise06;

public class Chatting {
	void startchat(String chatId) {
		/*
		 * �͸� ���� ��ü���� ���� ������ ����ϰ� �Ǹ� 
		 * �� ������ final Ư���� ���� �ǹǷ� ���� ������ �� ����.
		String nickName = null;
		nickName = chatId;
		
		*/
		// final Ư���� ���� ��
		final String nickName = chatId;
		// String nickName = chatId;
		
		Chat chat = new Chat() { // �͸� ���� ��ü���� nickName�� ���
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

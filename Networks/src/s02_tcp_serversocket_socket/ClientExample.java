package s02_tcp_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println( "[Ŭ���̾�Ʈ] ���� ��û!");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[Ŭ���̾�Ʈ] ���� ����!");
		} 
		catch(Exception e) {}

		System.out.println("[Ŭ���̾�Ʈ] �������:" + socket.isClosed());
		
		if(!socket.isClosed()) {
			try {
				socket.close();
				System.out.println( "[Ŭ���̾�Ʈ] ���� �ݱ�.");
			} 
			catch (IOException e1) {}
		}	
	}
}
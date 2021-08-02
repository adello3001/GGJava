package s02_tcp_serversocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println( "[클라이언트] 연결 요청!");
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[클라이언트] 연결 성공!");
		} 
		catch(Exception e) {}

		System.out.println("[클라이언트] 연결상태:" + socket.isClosed());
		
		if(!socket.isClosed()) {
			try {
				socket.close();
				System.out.println( "[클라이언트] 연결 닫기.");
			} 
			catch (IOException e1) {}
		}	
	}
}
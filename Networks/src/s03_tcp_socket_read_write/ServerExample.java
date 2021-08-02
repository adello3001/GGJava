package s03_tcp_socket_read_write;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();		
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println( "[서버] 연결 기다림...");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[서버] 연결 수락, 클라이언트정보=" + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[서버] 데이터 수신: " + message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hi! 클라이언트!!!";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println( "[서버] 클라이언트로 데이터 보냄: " + message);
				
				is.close();
				os.close();
				socket.close();
			}
		} catch(Exception e) {
			System.out.println("[서버] 예외발생:" + e.getMessage());
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e1) {}
		}
	}
}
